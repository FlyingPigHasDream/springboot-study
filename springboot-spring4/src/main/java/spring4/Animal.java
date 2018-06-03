package spring4;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author rainyday
 * @createTime 2018/6/3.
 */
public class Animal {

    @PostConstruct
    public void inital() {
        System.out.println("-------------- inital--------------");
    }

    @PreDestroy
    public void destory() {
        System.out.println("----------------close---------------");
    }
}
