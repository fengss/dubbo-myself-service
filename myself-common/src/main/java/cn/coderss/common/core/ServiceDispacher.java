package cn.coderss.common.core;

/**
 * Created with dubbo-myself-service.
 * User: shenwei
 * Date: 2017/11/3
 * Time: 下午3:04
 * Blog: http://www.coderss.cn
 *
 * @author ss
 */
public interface ServiceDispacher {
    CallResult invoke(Service service);
}
