package day08.code.jdbc.pojo;

/**
 * @ClassName User
 * @Author 小鬼
 * @Date 2019/7/27 16:37
 * @Description
 * @Version V1.0
 **/
public class User {
    private Integer id;
    private String name;
    private String passwd;

    private User(){}

    public static User of(){
        return  new User();
    }

    private User(String name){
        this.name = name;
    }

    public static User of(String name){
        return new User(name);
    }
    private User(String name,String passwd){
        this.name = name;
        this.passwd = passwd;
    }

    public static User of(String name,String passwd){
        return new User(name,passwd);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
