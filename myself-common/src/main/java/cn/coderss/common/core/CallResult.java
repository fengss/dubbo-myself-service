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

public class CallResult implements Serializable {

    private static final long serialVersionUID = 28738282394238L;
    /**
     * 结果编码 , 0:成功，其它：失败
     */
    Integer code = 0;

    String message = "";
    /**
     * 结果
     */
    Map data;

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public Map getData() {
        return data;
    }
    public void setData(Map data) {
        this.data = data;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object get(String key){
        Object value = data != null?data.get(key):null;
        return value;
    }
}