package cn.coderss.service.user.api;

import cn.coderss.common.model.User;

/**
 * Created with dubbo-myself-service.
 * User: shenwei
 * Date: 2017/11/1
 * Time: 下午2:52
 * Blog: http://www.coderss.cn
 *
 * @author ss
 */
public interface UserService {
    User getUserByName(String name);
}
