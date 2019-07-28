package day07.jdbc.demo2;

import day07.jdbc.demo2.convert.UserModifyConvert;
import day07.jdbc.demo2.convert.impl.InsertUserConvertUser;
import day07.jdbc.demo2.pojo.User;
import org.junit.Test;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @ClassName App
 * @Author 小鬼
 * @Date 2019/7/27 9:49
 * @Description
 * @Version V1.0
 **/
public class App {

    @Test
    public void testInsert(){
        User user = User.of();
        user.setName("wangqi");
        user.setPasswd("123456");
        String sql = "insert into user(cname,passwd) values(?,?)";
        UserDBHandler.of()
                .modify(sql, user, new UserModifyConvert() {
                    @Override
                    public void convert(PreparedStatement statement, User user) throws SQLException {
                        statement.setString(1,user.getName());
                        statement.setString(2,user.getPasswd());
                    }
                });
    }

    @Test
    public void testInsert2(){
        User user = User.of();
        user.setName("wangjiu");
        user.setPasswd("123456");
        String sql = "insert into user(cname,passwd) values(?,?)";
        UserDBHandler.of()
                .modify(sql,user,new InsertUserConvertUser());
    }
}
