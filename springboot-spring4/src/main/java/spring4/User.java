package spring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @author rainyday
 * @createTime 2018/6/3.
 */
@Component("myUser")
public class User {

    // Spring注解
    @Autowired
    @Qualifier("createUserDao")
    private UserDao userDao;

    //JSR  250 注解
    @Resource
    private Car Car;

    // JSR-330注解
    @Inject
    private Cat cat;

    public void show() {
        System.out.println(userDao);
    }
}
