package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author rainyday
 * @createTime 2018/6/4.
 */
@SpringBootApplication
@ConfigurationProperties
public class App {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(App.class);
        app.setAdditionalProfiles("test");

        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        System.out.println(context.getBean("tomcatProperties", TomcatProperties.class));
        System.out.println(context.getEnvironment().getProperty("spring.aa"));
        System.out.println(context.getEnvironment().getProperty("jdbc"));
        context.close();
    }
}
