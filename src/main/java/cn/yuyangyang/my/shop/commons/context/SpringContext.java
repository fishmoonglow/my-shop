package cn.yuyangyang.my.shop.commons.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author yuy【yuygroup@163.com】
 * @Date 2019/5/28
 */
public final class SpringContext {

    public Object getBean(String beanId){
        ApplicationContext context= new ClassPathXmlApplicationContext("spring-context.xml");
        return context.getBean(beanId) ;
    }
}
