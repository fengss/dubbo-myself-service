import cn.coderss.common.model.User;
import cn.coderss.service.user.api.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.regex.Pattern;

/**
 * Created with dubbo-myself-service.
 * User: shenwei
 * Date: 2017/11/2
 * Time: 上午9:42
 * Blog: http://www.coderss.cn
 *
 * @author ss
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"classpath:/dubbo-provider.xml"})
public class UserServiceTest {
    @Autowired
    UserService userService;
    private static final Pattern NAME_SEPARATOR = Pattern.compile("\\s*[,]+\\s*");

//    @Test
    public void getUserById(){
        User user = userService.getUserByName("2");
        System.out.println(user.toString());
    }

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/dubbo-provider.xml");
        context.start();
        System.in.read();
    }

    @Test
    public void testSplit(){
        String[] strs = NAME_SEPARATOR.split("dubbo,ok");
        for (String str: strs){
            System.out.println(str);
        }
    }
}
