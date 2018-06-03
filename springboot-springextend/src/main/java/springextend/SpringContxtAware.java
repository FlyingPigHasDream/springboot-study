package springextend;

import org.springframework.context.ApplicationContext;

/**
 * @author rainyday
 * @createTime 2018/6/3.
 */
public interface SpringContxtAware {
    void setApplicationContext(ApplicationContext applicationContext);
}
