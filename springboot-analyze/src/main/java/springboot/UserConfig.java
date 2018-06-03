package springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author rainyday
 * @createTime 2018/6/3.
 */
@Component
public class UserConfig {

    @Value("${local.port}")
    private String localPort;

    @Value("${app.name}")
    private String name;

    @Value("${tomcat.port:9000}")
    private String tomcatPort;

   /* @Value("${local.address}")
    private String localAddress;*/

    @Autowired
    private Environment environment;

    public void show() {
        System.out.println("local.ip= " + environment.getProperty("local.ip") );
        System.out.println("local.port= " + localPort);
      //  System.out.println("local.address= " + localAddress);
        System.out.println("app.anme = " + name);
        System.out.println("tomcat.port = " + tomcatPort);
    }
}
