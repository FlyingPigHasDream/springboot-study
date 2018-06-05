package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author rainyday
 * @createTime 2018/6/4.
 */
public class MyEnviromentPostProcessor implements EnvironmentPostProcessor {
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        try (InputStream input = new FileInputStream("F:\\applicaiton.properties")){
            Properties source = new Properties();
            source.load(input);
            PropertiesPropertySource propertiesPropertySource = new PropertiesPropertySource("my", source);
            environment.getPropertySources().addLast(propertiesPropertySource);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
