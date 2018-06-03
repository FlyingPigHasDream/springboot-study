package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author rainyday
 * @createTime 2018/6/3.
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        System.out.println(context.getEnvironment().getProperty("local.ip"));
        context.getBean("userConfig", UserConfig.class).show();
        context.getBean("jdbcConfig", JdbcConfig.class).show();
        context.getBean("configtationProperties", ConfigtationProperties.class).show();
        context.close();
    }
}
