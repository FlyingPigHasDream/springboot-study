package springextend;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Spring 在初始化所有bean后 判断所有ApplicationContextAware 的子类
 * 并把ApplicationContext 传进去 进行调用
 * @author rainyday
 * @createTime 2018/6/3.
 */
@Component
public class Book implements ApplicationContextAware{

    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void show() {
        System.out.println("Book:" + applicationContext.getClass());
    }
}
