package springboot;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * @author rainyday
 * @createTime 2018/6/4.
 */
@SpringBootConfiguration
//@PropertySource("classpath:jdbc.properties")
//@PropertySource("file:D:\\File\\Springboot\\springboot-study\\springboot-analyze\\src\\main\\resources\\jdbc.properties")
@PropertySources({@PropertySource("classpath:jdbc.properties")})
public class FileConfig {
}
