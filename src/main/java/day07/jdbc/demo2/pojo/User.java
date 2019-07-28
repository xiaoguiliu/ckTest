package day07.jdbc.demo2.pojo;

/**
 * @ClassName User
 * @Author 小鬼
 * @Date 2019/7/27 10:08
 * @Description
 * @Version V1.0
 **/
public class User {
    private int id;
    private String name;
    private String passwd;

    private User(){}

    public static User of(){
        return new User();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
