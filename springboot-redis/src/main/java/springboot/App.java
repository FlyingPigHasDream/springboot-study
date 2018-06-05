package springboot;

import bean.EnableRedis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;


/**
 * @author rainyday
 * @createTime 2018/6/5.
 */
@EnableRedis
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        Jedis jedis = context.getBean(Jedis.class);
        jedis.set("6379", "51");
        System.out.println(jedis.get("id"));
        context.close();
    }
}
