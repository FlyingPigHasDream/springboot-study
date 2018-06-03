package spring4;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author rainyday
 * @createTime 2018/6/3.
 */
public class RunnableFactoryBean implements FactoryBean<Jeep> {
    @Override
    public Jeep getObject() throws Exception {
        return new Jeep();
    }

    @Override
    public Class<?> getObjectType() {
        return Jeep.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
