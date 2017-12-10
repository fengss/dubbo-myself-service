package cn.coderss.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created with dubbo-myself-service.
 * User: shenwei
 * Date: 2017/11/1
 * Time: 下午4:36
 * Blog: http://www.coderss.cn
 *
 * @author ss
 */
@SpringBootApplication
@ImportResource({"classpath:dubbo-consumer.xml"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
