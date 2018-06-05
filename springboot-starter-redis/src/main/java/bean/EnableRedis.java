package bean;

import config.RedisAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author rainyday
 * @createTime 2018/6/5.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(RedisAutoConfiguration.class)
public @interface EnableRedis {
}
