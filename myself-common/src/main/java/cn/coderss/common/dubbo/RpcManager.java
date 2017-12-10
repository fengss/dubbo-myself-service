package cn.coderss.common.dubbo;

import cn.coderss.common.core.CallResult;
import cn.coderss.common.core.Service;

/**
 * Created with dubbo-myself-service.
 * User: shenwei
 * Date: 2017/11/3
 * Time: 下午3:16
 * Blog: http://www.coderss.cn
 *
 * @author ss
 */
public interface RpcManager {
    CallResult invoke(Service service);
}
