package cn.coderss.web.controller;

import cn.coderss.common.model.User;
import cn.coderss.service.user.api.UserDescription;
import cn.coderss.service.user.api.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with dubbo-myself-service.
 * User: shenwei
 * Date: 2017/11/1
 * Time: 下午4:47
 * Blog: http://www.coderss.cn
 *
 * @author ss
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @Reference(timeout = 600000)
    UserService service;


    @Reference(timeout = 60000)
    UserDescription userDescription;
//    @Reference(timeout = 600000, group = "*")
//    UserDescription userDescriptionService;


    @RequestMapping("/user")
    public User getUser(String name){
        return service.getUserByName(name);
    }

    @RequestMapping("/userdesc")
    public User getUserDesc(String name){
        return userDescription.getUserByName(name);
    }
}