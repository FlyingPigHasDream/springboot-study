package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author rainyday
 * @createTime 2018/6/3
 */
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("spring");
        context.getBeansOfType(Person.class).values().forEach(System.out ::println);
        context.close();
    }
}