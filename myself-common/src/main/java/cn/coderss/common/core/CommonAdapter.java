package cn.coderss.common.core;

import java.util.Map;

/**
 * Created with dubbo-myself-service.
 * User: shenwei
 * Date: 2017/11/3
 * Time: 下午3:02
 * Blog: http://www.coderss.cn
 *
 * @author ss
 */
public class CommonAdapter implements ServiceCallAdapter{

    private String service;
    private Map data;

    public CommonAdapter(String service,Map data) {
        super();
        this.service = service;
        this.data = data;
    }
    public String getName(){
        return service;
    }
    public Map getData(){
        return data;
    }
}