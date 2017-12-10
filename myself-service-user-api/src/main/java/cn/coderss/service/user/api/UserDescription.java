package cn.coderss.service.user.api;

import cn.coderss.common.model.User;

/**
 * Created with dubbo-myself-service.
 *
 * @author: shenwei
 * Date: 2017/11/8
 * Time: 下午3:41
 */
public interface UserDescription {
    User getUserByName(String name);
}
