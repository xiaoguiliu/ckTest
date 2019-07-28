package day08.code.jdbc;

import day08.code.jdbc.pojo.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserDao
 * @Author 小鬼
 * @Date 2019/7/27 16:54
 * @Description
 * @Version V1.0
 **/
public class UserDao extends AbstractDBHandler<User>{
    public int addUser(User user){
        String sql = "insert into user(`cname`,`passwd`) values(?,?)";
        List<Object> params = new ArrayList<>();
        params.add(user.getName());
        params.add(user.getPasswd());
        return modify(sql,params);
    }

    public List<User> queryByName(User user){
        String sql = "select * from user where cname=?";
        List<Object> params = new ArrayList<>();
        params.add(user.getName());
        return select(sql,params);
    }

    @Override
    protected User mapping(ResultSet resultSet) throws SQLException {
        User user = User.of();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("cname"));
        user.setPasswd(resultSet.getString("passwd"));
        return user;
    }
}
