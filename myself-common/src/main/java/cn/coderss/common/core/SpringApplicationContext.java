package cn.coderss.common.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
/**
 * Created with dubbo-myself-service.
 * User: shenwei
 * Date: 2017/11/3
 * Time: 下午3:04
 * Blog: http://www.coderss.cn
 *
 * @author ss
 */
@Component
public class SpringApplicationContext implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        SpringApplicationContext.context = applicationContext;
    }

    public static ApplicationContext getApplicationContext()
            throws BeansException {
        return context;
    }

    public static Object getBean(String beanId) {
        if (beanId == null || beanId.length() == 0) {
            return null;
        }
        Object object = null;
        object = context.getBean(beanId);
        return object;
    }

	/*
	public static Object getController(String controllerName) {
		 Map<String, Object> beansWithAnnotation = context.getBeansWithAnnotation(ApiController.class);
		 for(String s : beansWithAnnotation.keySet()) {
			 System.out.println(s);
		 }
		 return null;
	}
	*/

    public static  <T> T getBean(Class<T> clazz) {
        if (clazz == null ) {
            return null;
        }
        return context.<T>getBean(clazz);
    }

    /**
     * 从spring容器中获取指定的bean
     *
     * @param name
     * @param requiredType
     * @return
     * @throws BeansException
     */
    public static <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return context.getBean(name, requiredType);
    }

    public static void removeBean(String beanId){
        if (beanId == null || beanId.isEmpty()) {
            return ;
        }
        ConfigurableApplicationContext applicationContexts = (ConfigurableApplicationContext)context;
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) applicationContexts.getBeanFactory();
        beanFactory.removeBeanDefinition(beanId);
    }

    public static void removeBeans(String... beanIds){
        if(beanIds == null || beanIds.length == 0){
            return;
        }
        ConfigurableApplicationContext applicationContexts = (ConfigurableApplicationContext)context;
        DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) applicationContexts.getBeanFactory();
        for(String beanId : beanIds){
            if(beanId != null && !beanId.isEmpty()){
                if(beanFactory.isBeanNameInUse(beanId)){
                    beanFactory.removeBeanDefinition(beanId);
                }
            }
        }
    }


}
