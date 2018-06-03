package spring4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 类添加
 * @author rainyday
 * @createTime 2018/6/2.
 */
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class,
                User.class, UserService.class, UserController.class);
        System.out.println(context.getBean(MyBean.class));
        System.out.println(context.getBean("myBean"));
        //spring4.MyBean myBean = (spring4.MyBean) context.getBean("myBean");
        System.out.println(context.getBean(Jeep.class));
        System.out.println(context.getBean("createRunnableFactoryBean"));
        System.out.println(context.getBean("&createRunnableFactoryBean"));
        System.out.println(context.getBean(RunnableFactoryBean.class));
        System.out.println(context.getBean(Car.class));
        System.out.println(context.getBean(Cat.class));
        System.out.println(context.getBean(Dog.class));
        System.out.println(context.getBean(Animal.class));
        //System.out.println(context.getBean(spring4.User.class));
        System.out.println(context.getBean("createUser"));
        System.out.println(context.getBean("myUser"));
        System.out.println(context.getBeansOfType(User.class));
//        System.out.println(context.getBean(spring4.UserDao.class));
        //System.out.println(context.getBean("userDao"));
        System.out.println(context.getBean(UserService.class));
        System.out.println(context.getBean(UserController.class));
        User user = context.getBean("myUser", User.class);
        user.show();
        //myBean.createMyBean();
        context.close();
    }
}
