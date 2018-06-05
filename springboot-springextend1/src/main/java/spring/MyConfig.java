package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author rainyday
 * @createTime 2018/6/3.
 */
@Configuration
public class MyConfig {

    @Bean(initMethod = "init")
    public User createUser2() {
        return new User();
    }

    @Bean
    public User createUser() {
        return new User();
    }
}
