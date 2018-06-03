package springextend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * spring4.3之后构造bean构造方法需要的参数spring会自动注入进去
 * 1: 构造函数只能有一个，如果有多个的话，就必须有一个无参的狗仔函数，
 *  此时，spring会调用无参的构造函数
 * 2: 构造函数的参数必须都要在spring容器中有
 * @author rainyday
 * @createTime 2018/6/3.
 */
@Component
public class Bank {

    @Autowired
    private ApplicationContext applicationContext;

    public Bank() {
        this.applicationContext = applicationContext;
    }

    public Bank(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public Bank(ApplicationContext applicationContext, User user) {
        this.applicationContext = applicationContext;
    }

    public void show() {
        System.out.println("Bank:" + applicationContext.getClass());
    }
}
