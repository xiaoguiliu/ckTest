package day08.code.stream.pojo;

import java.util.Objects;

/**
 * @ClassName User
 * @Author 小鬼
 * @Date 2019/7/23 20:53
 * @Description
 * @Version V1.0
 **/
public class User {
    private int id;

    private String name;

    private User() {
    }

    private User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static User of(int id, String name) {
        return new User(id, name);
    }

    // @Override
    // public boolean equals(Object o) {
    //   if (this == o) {
    //     return true;
    //   }
    //   if (o == null || getClass() != o.getClass()) {
    //     return false;
    //   }
    //   User user = (User) o;
    //   return id == user.id &&
    //       Objects.equal(name, user.name);
    // }
    //
    // @Override
    // public int hashCode() {
    //   return Objects.hashCode(id, name);
    // }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
