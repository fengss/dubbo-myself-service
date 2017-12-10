package cn.coderss.service.user.impl;

import cn.coderss.common.model.User;
import cn.coderss.service.user.api.UserDescription;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * Created with dubbo-myself-service.
 *
 * @author: shenwei
 * Date: 2017/11/11
 * Time: 上午11:10
 */
@Service(timeout = 600000)
public class UserDescImpl implements UserDescription{
    @Override
    public User getUserByName(String name) {
        throw new RuntimeException();
    }
}
