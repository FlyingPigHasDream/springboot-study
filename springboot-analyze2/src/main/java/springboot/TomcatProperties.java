package springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author rainyday
 * @createTime 2018/6/4.
 */
@Component
@ConfigurationProperties("tomcat")
@PropertySource("classpath:application.yml")
public class TomcatProperties {

    private List<String> hosts = new ArrayList<String>();

    @Value("${strs}")
    private String strs;

    private String[] strs1 = new String[3];

    public String[] getStrs1() {
        return strs1;
    }

    @Override
    public String toString() {
        return "TomcatProperties{" +
                "hosts=" + hosts +
                ", strs='" + strs + '\'' +
                ", strs1=" + Arrays.toString(strs1) +
                '}';
    }

    public String[] getStrs() {
        return strs1;
    }

    public List<String> getHosts() {
        return hosts;
    }

}
