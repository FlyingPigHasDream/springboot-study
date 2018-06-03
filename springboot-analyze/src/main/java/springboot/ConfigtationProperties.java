package springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author rainyday
 * @createTime 2018/6/4.
 */
@Component
@ConfigurationProperties(prefix = "spring")
public class ConfigtationProperties {

    private String name2;

    public void show() {
        System.out.println("name = " + name2);
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }
}
