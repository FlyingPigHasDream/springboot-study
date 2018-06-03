package springextend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * BeanPostProcessor 会在每一个bean初始化的时候，调用一次
 * 两个方法不能返回null ，否则从容器中获取不到
 * @author rainyday
 * @createTime 2018/6/3.
 */
@Component
public class EchoBeanPostProcessor implements BeanPostProcessor {

    @Autowired
    private ApplicationContext applicationContext;

    /**
     * set 之后触发
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("---------postProcessBeforeInitialization----" + bean.getClass());
        if (bean instanceof User) {
            bean = new LogUser();
        }
        /*if (bean instanceof SpringContextAware) {

        }*/
        return bean;
    }

    /**
     * init 之后触发
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("------------------postProcessAfterInitialization-------" + bean.getClass());
        return bean;
    }
}
