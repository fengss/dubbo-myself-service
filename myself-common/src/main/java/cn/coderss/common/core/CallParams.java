package cn.coderss.common.core;

import java.io.Serializable;
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
public class CallParams implements Serializable {

    private static final long serialVersionUID = 273828239238L;

    /**
     * 调用参数
     */
    Map data;

    public Map getData() {
        return data;
    }

    public void setData(Map data) {
        this.data = data;
    }

    public Object get(String key){
        Object value = data != null?data.get(key):null;
        return value;
    }
}
