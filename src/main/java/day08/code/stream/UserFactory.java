package day08.code.stream;

import day08.code.stream.pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserFactory
 * @Author 小鬼
 * @Date 2019/7/23 20:58
 * @Description
 * @Version V1.0
 **/
public class UserFactory {
    public static List<User> getSimpleUsers(boolean type) {

        List<User> users = new ArrayList();

        if (type) {
            users.add(User.of(1, "张三"));
            users.add(User.of(1, "李四"));
            users.add(User.of(1, "王五"));
        } else {
            users.add(User.of(1, "张三"));
            users.add(User.of(1, "李四"));
            users.add(User.of(1, "王五"));
            users.add(User.of(1, "王二麻子"));
            users.add(User.of(1, "小淘气"));
        }

        return users;
    }

    public static List<User> getSimpleUsers() {

        List<User> users = new ArrayList();

        users.add(User.of(1, "张三"));
        users.add(User.of(1, "李四"));
        users.add(User.of(1, "王五"));
        users.add(User.of(1, "王五"));
        users.add(User.of(1, "王五"));
        users.add(User.of(1, "王五"));
        users.add(User.of(1, "王五"));
        users.add(User.of(1, "王二麻子"));
        users.add(User.of(1, "小淘气"));

        return users;
    }
}
