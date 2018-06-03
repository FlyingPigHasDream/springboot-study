package spring4;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author rainyday
 * @createTime 2018/6/3.
 */
public class Cat implements InitializingBean, DisposableBean{
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("===========");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("disposablebean====================");
    }
}
