package springextend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * 1. Spring 在初始化所有bean后 判断所有ApplicationContextAware 的子类
 *  并把ApplicationContext 传进去 进行调用
 *  Spring源码引用
 *  AnnotationConfigApplicationContext -> AnnotationConfigApplicationContext( -> GenericApplicationContext )
 *      -> AbstractApplicationContext -> (method)refresh(-> prepareBeanFactory())
 *      -> beanFactory.addBeanPostProcessor(new ApplicationContextAwareProcessor(this));
 *
 * 2. spring4.3之后构造bean构造方法需要的参数spring会自动注入进去
 * @author rainyday
 * @createTime 2018/6/3.
 */
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("springextend");
        System.out.println(context.getBean("user"));
        System.out.println(context.getBean("createUser"));
        context.getBean("createUser", User.class).show();
        context.getBean("book", Book.class).show();
        context.getBean("bank", Bank.class).show();



        context.close();

    }
}
