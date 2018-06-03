package springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author rainyday
 * @createTime 2018/6/4.
 */
@Component
public class JdbcConfig {

    @Value("${url}")
    private String url;

    public void show() {
        System.out.println("url = " + url);
    }

}
