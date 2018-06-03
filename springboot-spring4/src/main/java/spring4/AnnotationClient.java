package spring4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 扫包
 * @author rainyday
 * @createTime 2018/6/3.
 */
public class AnnotationClient {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("spring4");
        System.out.println(context.getBean(Jeep.class));
        System.out.println(context.getBean("createRunnableFactoryBean"));
        System.out.println(context.getBean("&createRunnableFactoryBean"));
        System.out.println(context.getBean(RunnableFactoryBean.class));
        System.out.println(context.getBean(Car.class));
        System.out.println(context.getBean(Cat.class));
        System.out.println(context.getBean(Dog.class));
        System.out.println(context.getBean(Animal.class));
        //System.out.println(context.getBean(spring4.User.class));
    }
}
