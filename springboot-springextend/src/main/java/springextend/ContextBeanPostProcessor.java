package springextend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author rainyday
 * @createTime 2018/6/3.
 */
@Component
public class ContextBeanPostProcessor implements BeanPostProcessor {

    @Autowired
    private ApplicationContext applicationContext;

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware){
            ApplicationContextAware aca = (ApplicationContextAware) bean;
            aca.setApplicationContext(applicationContext);
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
