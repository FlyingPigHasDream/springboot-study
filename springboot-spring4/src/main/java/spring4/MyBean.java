package spring4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author rainyday
 * @createTime 2018/6/2.
 */
//@Configuration
public class MyBean {

   // @Bean(name = "mybean")
    public String createMyBean() {
        return "zhangsan";
    }
}
