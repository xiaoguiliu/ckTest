package day08.code.jdbc;

import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AbstractDBHandler
 * @Author 小鬼
 * @Date 2019/7/27 16:03
 * @Description
 * @Version V1.0
 **/
public abstract class AbstractDBHandler<T> implements DBHandler<T> {

    public int modify(String sql, List<Object> params){
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            connection = ConnectionHandler.of().getConnection();
            statement = connection.prepareStatement(sql);
            for (int i = 0; i < params.size(); i++) {
                statement.setObject(i+1,params.get(i));
            }
            int effectRows = statement.executeUpdate();
            return effectRows;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }finally{
            release(null,statement,connection);
        }
    }

    public List<T> select(String sql,List<Object> params){
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try{
            connection = ConnectionHandler.of().getConnection();
            statement = connection.prepareStatement(sql);
            // TODO: 2019/7/28 1、statement设置参数
            for (int i = 0; i < params.size(); i++) {
                statement.setObject(i+1,params.get(i));
            }
            //TODO: 2019/7/28  2、遍历查询结果
            resultSet = statement.executeQuery();
            List<T> result = new ArrayList<>();
            while(resultSet.next()){
                //TODO: 2019/7/28 3、取resultSet中数据来设置User类对应的属性值。
                //  并将user对象放到新的List集合中。
                 T t = mapping(resultSet);
                 result.add(t);
            }
            return result;
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }finally {
            release(resultSet,statement,connection);
        }
    }

    protected abstract T mapping(ResultSet resultSet) throws SQLException;

    private void release(ResultSet resultSet ,PreparedStatement statement, Connection connection){
        try{
            if(null != resultSet){
                resultSet.close();
            }
            if(null != statement){
                statement.close();
            }

            if(null != connection){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
