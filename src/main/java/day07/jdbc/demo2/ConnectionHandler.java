package day07.jdbc.demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @ClassName ConnectionHandler
 * @Author 小鬼
 * @Date 2019/7/27 9:07
 * @Description
 * @Version V1.0
 **/
public class ConnectionHandler {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/cakes";
    private static final String USER_NAME = "root";
    private static final String PASSWD = "123456";

    private ConnectionHandler(){
    }

    public static ConnectionHandler of(){
        return new ConnectionHandler();
    }

    public Connection getConnection(){
        try{
            return DriverManager.getConnection(URL,USER_NAME,PASSWD);
        }catch(SQLException e){
            throw new IllegalStateException(e);
        }
    }
}
