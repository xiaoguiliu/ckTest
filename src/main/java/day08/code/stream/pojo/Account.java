package day08.code.stream.pojo;
import java.util.List;

/**
 * @ClassName Account
 * @Author 小鬼
 * @Date 2019/7/23 20:51
 * @Description
 * @Version V1.0
 **/
public class Account {
    private int id;

    private String accountName;

    private boolean isInner;
    private boolean isA;
    private boolean isB;
    private boolean isC;

    private String type;

    private List<User> users;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public boolean isInner() {
        return isInner;
    }

    public void setInner(boolean inner) {
        isInner = inner;
    }

    public boolean isA() {
        return isA;
    }

    public void setA(boolean a) {
        isA = a;
    }

    public boolean isB() {
        return isB;
    }

    public void setB(boolean b) {
        isB = b;
    }

    public boolean isC() {
        return isC;
    }

    public void setC(boolean c) {
        isC = c;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private Account() {
    }

    private Account(int id, String accountName, boolean isInner, String type, List<User> users) {
        this.id = id;
        this.accountName = accountName;
        this.isInner = isInner;
        this.type = type;
        this.users = users;
    }

    public Account(int id, String accountName, boolean isInner, boolean isA, boolean isB, boolean isC,
                   String type) {
        this.id = id;
        this.accountName = accountName;
        this.isInner = isInner;
        this.isA = isA;
        this.isB = isB;
        this.isC = isC;
        this.type = type;
    }

    public static Account of(int id, String accountName, boolean isInner, String type,
                             List<User> users) {
        return new Account(id, accountName, isInner, type, users);
    }

    public static Account of(int id, String accountName, boolean isInner, boolean isA, boolean isB,
                             boolean isC,
                             String type) {
        return new Account(id, accountName, isInner, isA, isB, isC, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Account account = (Account) o;

        if (id != account.id) {
            return false;
        }
        return accountName != null ? accountName.equals(account.accountName)
                : account.accountName == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (accountName != null ? accountName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", isInner=" + isInner +
                ", isA=" + isA +
                ", isB=" + isB +
                ", isC=" + isC +
                ", type='" + type + '\'' +
                ", users=" + users +
                '}';
    }
}
