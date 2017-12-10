package cn.coderss.common.core;

import cn.coderss.common.dubbo.RpcManager;
import cn.coderss.common.exception.LouieException;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with dubbo-myself-service.
 * User: shenwei
 * Date: 2017/11/3
 * Time: 下午3:03
 * Blog: http://www.coderss.cn
 *
 * @author ss
 */
public class ServiceCall implements Serializable {
    private static final long serialVersionUID = 2873828239238L;

    private ServiceCallAdapter adapter;

    public ServiceCall(ServiceCallAdapter adapter) {
        this.adapter = adapter;
    }

    public  CallResult invoke(){
        String serviceName = adapter.getName();
        if(serviceName == null || serviceName == ""){
            throw new LouieException("服务未定义");
        }
        String[] names = serviceName.split("\\.");
        if(names.length < 3){
            throw new LouieException("服务定义错误");
        }
        String sys = names[0];
        RpcManager rpc = (RpcManager) SpringApplicationContext.getBean(sys + "Call");
        if(rpc == null){
            throw new LouieException("未定义远程系统");
        }
        Map data = adapter.getData();
        data = data == null ? new HashMap<String,Object>():data;
        Service service = new Service(serviceName,data);
        return rpc.invoke(service);
    }

}