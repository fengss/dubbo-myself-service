package cn.coderss.common.dubbo;

import cn.coderss.common.core.CallResult;
import cn.coderss.common.core.Service;
import cn.coderss.common.core.ServiceDispacher;
import cn.coderss.common.core.ServiceDispacherImpl;

/**
 * Created with dubbo-myself-service.
 * User: shenwei
 * Date: 2017/11/3
 * Time: 下午3:16
 * Blog: http://www.coderss.cn
 *
 * @author ss
 */
public class RpcManagerImpl implements RpcManager{


    @Override
    public CallResult invoke(Service service) {
        // TODO Auto-generated method stub
        //System.out.println("client r:"+obj.toString());
        //return obj.toString();
		/*
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationConsumer.xml" });
	    context.start();
	    RpcManager demoServer = (RpcManager) context.getBean("demoService");
	    Map<String,Object> params = new HashMap<String,Object>();
	    params.put("name", "account.user.login");
	    ServiceCall  shop = new ServiceCall();
	    shop.setName("account.user.info");
	    String result = demoServer.sayHello(shop);
	    System.out.println("eshop:"+result);
	    */
        ServiceDispacher serviceDispacher = new ServiceDispacherImpl();
        return serviceDispacher.invoke(service);

    }

}
