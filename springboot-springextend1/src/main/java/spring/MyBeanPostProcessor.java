package spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author rainyday
 * @createTime 2018/6/3.
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor{
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("post process before");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("post process after");
        return bean;
    }
}
