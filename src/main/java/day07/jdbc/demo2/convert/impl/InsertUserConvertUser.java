package day07.jdbc.demo2.convert.impl;

import day07.jdbc.demo2.convert.UserModifyConvert;
import day07.jdbc.demo2.pojo.User;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @ClassName InsertUserConvertUser
 * @Author 小鬼
 * @Date 2019/7/27 11:54
 * @Description
 * @Version V1.0
 **/
public class InsertUserConvertUser implements UserModifyConvert {

    @Override
    public void convert(PreparedStatement statement, User user) throws SQLException {
        statement.setString(1, user.getName());
        statement.setString(2, user.getPasswd());
    }
}
