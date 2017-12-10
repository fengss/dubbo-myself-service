package cn.coderss.service.user.impl;

import cn.coderss.common.model.User;
import cn.coderss.service.user.api.UserService;
import cn.coderss.service.user.mapper.CmsUsersMapper;
import cn.coderss.service.user.model.CmsUsers;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with dubbo-myself-service.
 * User: shenwei
 * Date: 2017/11/1
 * Time: 下午3:21
 * Blog: http://www.coderss.cn
 *
 * @author ss
 */
@Service(timeout = 600000)
public class UserServiceImpl implements UserService {
    @Autowired
    CmsUsersMapper usersMapper;

    @Override
    public User getUserByName(String name) {
        CmsUsers user = usersMapper.selectByPrimaryKey((long)4);
        return new User(name, 20, user.getUserNicename());
    }
}
