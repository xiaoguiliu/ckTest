package day07.jdbc.demo1;

import org.junit.Test;

import java.sql.*;

/**
 * @ClassName UserDemo
 * @Author 小鬼
 * @Date 2019/7/25 15:20
 * @Description
 * @Version V1.0
 **/
public class UserDemo {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/cakes";
    private static final String USER_NAME = "root";
    private static final String PASSWD = "123456";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    @Test
    public void test1() throws Exception {
//        加载驱动，新版版本驱动默认自动加载。比如8.0
        Class.forName(DRIVER);
//        建立连接
        Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWD);
//        建立sql操作对象
        Statement statement = connection.createStatement();
//        执行sql语句
        String sql = "insert into user(id,cname) values(2,'wangwu')";
        statement.executeUpdate(sql);
//        关闭资源
        statement.close();
        connection.close();

    }

//    修改数据
    @Test
    public void test2() throws Exception{
//        创建链接
        Connection connection = DriverManager.getConnection(URL, USER_NAME, PASSWD);
//        创建stament对象
        Statement statement = connection.createStatement();
//        执行sql
        String sql = "UPDATE USER SET passwd='123456' WHERE id =1";
        statement.executeUpdate(sql);
//        关闭资源
        statement.close();
        connection.close();
    }

//    删除数据
    @Test
    public void test3() throws Exception{
//        加载驱动
        Class.forName(DRIVER);
//        创建链接
        Connection connection = DriverManager.getConnection(URL, USER_NAME,PASSWD);
//        创建sql操作对象
        Statement statement = connection.createStatement();
        String sql = "delete from user where id=2";
        statement.executeUpdate(sql);
//        关闭资源
        statement.close();
        connection.close();
    }

//    查询数据
    @Test
    public void test4() throws Exception{
        Connection connection = DriverManager.getConnection(URL,USER_NAME,PASSWD);
        Statement statement = connection.createStatement();
        String sql = "select id,cname from user";
        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()){
            int id = resultSet.getInt("id");
            String name= resultSet.getString("cname");
            String info = String.format("user id=%s,cname=%s",id,name);
            System.out.println(info);
        }
        statement.close();
        connection.close();
    }
}
