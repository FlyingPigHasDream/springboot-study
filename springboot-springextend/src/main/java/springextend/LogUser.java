package springextend;

/**
 * @author rainyday
 * @createTime 2018/6/3.
 */
public class LogUser extends User{

    @Override
    public void show() {
        System.out.println("show satrt---");
        super.show();
        System.out.println("show end-----");
    }
}
