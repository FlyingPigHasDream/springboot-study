package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;

/**
 * @author rainyday
 * @createTime 2018/6/3.
 */
@SpringBootApplication
public class App {

    @Bean
    public Runnable createRunnable() {
       return ()->{System.out.println("springboot is run");};
    }

    /**
     *
     * App.class 入口会被装配成配置类
     * @param args
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        context.getBean(Runnable.class).run();
    }
}
