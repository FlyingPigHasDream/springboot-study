package spring4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author rainyday
 * @createTime 2018/6/3.
 */
@Configuration
public class DogConfig {

    @Bean(initMethod = "init", destroyMethod = "destory")
    public Dog createDog() {
        return new Dog();
    }
}
