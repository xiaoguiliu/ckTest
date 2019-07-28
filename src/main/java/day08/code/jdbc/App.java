package day08.code.jdbc;

import day07.jdbc.demo2.UserDBHandler;
import day08.code.jdbc.pojo.User;
import org.junit.Test;

/**
 * @ClassName App
 * @Author 小鬼
 * @Date 2019/7/28 10:41
 * @Description
 * @Version V1.0
 **/
public class App {
    @Test
    public void testInsert(){
        UserDao userDao =  new UserDao();
        User user  = User.of("sansiwu","123456");
        userDao.addUser(user);
    }

    @Test
    public void testSelect(){
        UserDao userDao = new UserDao();
        User user = User.of("sansiwu");
        userDao.queryByName(user);
    }
}
