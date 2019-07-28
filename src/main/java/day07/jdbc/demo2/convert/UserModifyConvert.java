package day07.jdbc.demo2.convert;

import day07.jdbc.demo2.pojo.User;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface UserModifyConvert {
    void convert(PreparedStatement statement, User user)throws SQLException;
}
