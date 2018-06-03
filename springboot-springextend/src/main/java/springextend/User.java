package springextend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @author rainyday
 * @createTime 2018/6/3.
 */
@Controller
@Component
public class User {

    @Autowired
    //@Resource
    //@Inject
    private ApplicationContext applicationContext;

    public void init() {
        System.out.println("---init----");
    }

    public void show() {
        System.out.println("User:" + applicationContext);
    }

    /**
     * Autowired 也作用在set方法上
     * @param applicationContext
     */
    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        System.out.println("-------set");
    }
}
