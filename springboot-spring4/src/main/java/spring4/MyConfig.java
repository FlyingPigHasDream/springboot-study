package spring4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author rainyday
 * @createTime 2018/6/3.
 */
@Configuration
public class MyConfig {

    @Bean
    public CarFactory createCarFactory() {
        return new CarFactory();
    }

    @Bean(name = "myBean")
    @Scope("prototype")
    public MyBean createMyBean() {
        return new MyBean();
    }

    @Bean
    public RunnableFactoryBean createRunnableFactoryBean() {
        return new RunnableFactoryBean();
    }

    @Bean
    public Car createJeep(CarFactory carFactory) {
        return carFactory.cteateCar();
    }

    @Bean
    public Cat createCat() {
        return new Cat();
    }

    @Bean
    public Animal createAnimal() {
        return new Animal();
    }

    @Bean
    public User createUser() {
        return new User();
    }

    @Bean
    public UserDao createUserDao() {
        return new UserDao();
    }

    @Bean
    public UserDao createUserDao2() {
        return new UserDao();
    }
}
