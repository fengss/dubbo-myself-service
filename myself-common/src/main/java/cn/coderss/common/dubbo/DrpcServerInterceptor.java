package cn.coderss.common.dubbo;


import cn.coderss.common.config.ZipkinConfig;
import cn.coderss.common.constant.ZipkinConstants;
import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.rpc.*;
import com.github.kristofa.brave.*;
import zipkin.reporter.AsyncReporter;
import zipkin.reporter.Reporter;
import zipkin.reporter.Sender;
import zipkin.reporter.okhttp3.OkHttpSender;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import static com.github.kristofa.brave.IdConversion.convertToLong;
/**
 * Created with dubbo-myself-service.
 * User: shenwei
 * Date: 2017/11/3
 * Time: 下午3:15
 * Blog: http://www.coderss.cn
 *
 * @author ss
 */
@Activate(group = Constants.PROVIDER)
public class DrpcServerInterceptor implements Filter{

    private final ServerRequestInterceptor serverRequestInterceptor;
    private final ServerResponseInterceptor serverResponseInterceptor;

    public DrpcServerInterceptor() {
        String sendUrl = ZipkinConfig.getProperty(ZipkinConstants.SEND_ADDRESS);
        Sender sender = OkHttpSender.create(sendUrl);
        Reporter<zipkin.Span> reporter = AsyncReporter.builder(sender).build();
        String application = ZipkinConfig.getProperty(ZipkinConstants.BRAVE_NAME);//RpcContext.getContext().getUrl().getParameter("application");
        Brave brave = new Brave.Builder(application).reporter(reporter).build();
        this.serverRequestInterceptor = brave.serverRequestInterceptor();
        this.serverResponseInterceptor = brave.serverResponseInterceptor();
    }

    @Override
    public Result invoke(Invoker<?> arg0, Invocation arg1) throws RpcException {
        serverRequestInterceptor.handle(new DrpcServerRequestAdapter(arg1));
        Result result ;
        try {
            result =  arg0.invoke(arg1);
            serverResponseInterceptor.handle(new GrpcServerResponseAdapter(result));
        } finally {

        }
        return result;
    }

    static final class DrpcServerRequestAdapter implements ServerRequestAdapter {
        private Invocation invocation;
        DrpcServerRequestAdapter(Invocation invocation) {
            this.invocation = invocation;
        }


        @Override
        public TraceData getTraceData() {
            //Random randoml = new Random();
            Map<String,String> at = this.invocation.getAttachments();
            String sampled = at.get("Sampled");
            String parentSpanId = at.get("ParentSpanId");
            String traceId = at.get("TraceId");
            String spanId = at.get("SpanId");

            // Official sampled value is 1, though some old instrumentation send true
            Boolean parsedSampled = sampled != null
                    ? sampled.equals("1") || sampled.equalsIgnoreCase("true")
                    : null;

            if (traceId != null && spanId != null) {
                return TraceData.create(getSpanId(traceId, spanId, parentSpanId, parsedSampled));
            } else if (parsedSampled == null) {
                return TraceData.EMPTY;
            } else if (parsedSampled.booleanValue()) {
                // Invalid: The caller requests the trace to be sampled, but didn't pass IDs
                return TraceData.EMPTY;
            } else {
                return TraceData.NOT_SAMPLED;
            }
        }


        @Override
        public String getSpanName() {
            return invocation.getMethodName();
        }


        @Override
        public Collection<KeyValueAnnotation> requestAnnotations() {
            SocketAddress socketAddress = null;
            if (socketAddress != null) {
                KeyValueAnnotation remoteAddrAnnotation = KeyValueAnnotation.create(
                        "DRPC_REMOTE_ADDR", socketAddress.toString());
                return Collections.singleton(remoteAddrAnnotation);
            } else {
                return Collections.emptyList();
            }
        }
    }

    static final class GrpcServerResponseAdapter implements ServerResponseAdapter {

        final Result result;

        public GrpcServerResponseAdapter(Result result) {
            this.result = result;
        }

        @Override
        @SuppressWarnings("unchecked")
        public Collection<KeyValueAnnotation> responseAnnotations() {
            return !result.hasException()
                    ? Collections.<KeyValueAnnotation>emptyList()
                    : Collections.singletonList(KeyValueAnnotation.create("error", result.getException().getMessage()));
        }

    }

    static SpanId getSpanId(String traceId, String spanId, String parentSpanId, Boolean sampled) {
        return SpanId.builder()
                .traceIdHigh(traceId.length() == 32 ? convertToLong(traceId, 0) : 0)
                .traceId(convertToLong(traceId))
                .spanId(convertToLong(spanId))
                .sampled(sampled)
                .parentId(parentSpanId == null ? null : convertToLong(parentSpanId)).build();
    }
}
