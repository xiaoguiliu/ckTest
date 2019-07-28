package day08.code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static day08.code.jdbc.JdbcConsts.*;

/**
 * @ClassName ConnectionHandler
 * @Author 小鬼
 * @Date 2019/7/27 16:09
 * @Description
 * @Version V1.0
 **/
public class ConnectionHandler {
    private ConnectionHandler(){}

    public static ConnectionHandler of(){
        return new ConnectionHandler();
    }

    public Connection getConnection(){
        try{
            return DriverManager.getConnection(URL,USER_NAME,PASSWD);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
