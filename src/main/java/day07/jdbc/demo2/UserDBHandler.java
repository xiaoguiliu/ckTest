package day07.jdbc.demo2;
import day07.jdbc.demo2.convert.UserModifyConvert;
import day07.jdbc.demo2.pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @ClassName UserDBHandler
 * @Author 小鬼
 * @Date 2019/7/27 9:20
 * @Description
 * @Version V1.0
 **/
public class UserDBHandler{
    private UserDBHandler() {
    }

    public static UserDBHandler of() {
        return new UserDBHandler();
    }

    public int modify(String sql, User user, UserModifyConvert converts) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionHandler.of().getConnection();
            preparedStatement = connection.prepareStatement(sql);
//            执行sql参数
            converts.convert(preparedStatement, user);
            int effectRows = preparedStatement.executeUpdate();
            System.out.println("effectRows=" + effectRows);
            return effectRows;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        } finally {
            release(null, preparedStatement, connection);
        }
    }

    private void release(ResultSet resultSet, PreparedStatement preparedStatement, Connection connection) {
        try {
            if (null != resultSet) {
                resultSet.close();
            }

            if (null != preparedStatement) {
                preparedStatement.close();
            }

            if (null != connection) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
