package spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * @author rainyday
 * @createTime 2018/6/3.
 */
public class MyBeanDefinitionRegistry implements BeanDefinitionRegistryPostProcessor {

    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        for (int i = 0; i <= 10; i++) {
            BeanDefinitionBuilder bdh = BeanDefinitionBuilder.rootBeanDefinition(Person.class);
            bdh.addPropertyValue("name", "admin" + i);
            registry.registerBeanDefinition("person" + i, bdh.getBeanDefinition());
        }
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
