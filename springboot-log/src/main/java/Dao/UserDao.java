package Dao;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * @author rainyday
 * @createTime 2018/6/5.
 */
@Component
public class UserDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserDao.class);

    public void log() {
        System.out.println("123");
        LOGGER.info("info ..");
        LOGGER.debug("debug ...");
        LOGGER.warn("warn ...");
        LOGGER.error("error ...");
    }
}
