package day08.code.stream;

import day08.code.stream.pojo.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName AccountFactory
 * @Author 小鬼
 * @Date 2019/7/23 20:56
 * @Description
 * @Version V1.0
 **/
public class AccountFactory {
    public static List<Account> getSimpleAccounts() {

        List<Account> accounts = new ArrayList<>();

        accounts.add(Account.of(1, "微信支付1账户", false, "出款", UserFactory.getSimpleUsers(true)));
        accounts.add(Account.of(2, "微信支付2账户", false, "入款", UserFactory.getSimpleUsers(true)));
        accounts.add(Account.of(3, "微信支付3账户", true, "出款", UserFactory.getSimpleUsers(false)));
        accounts.add(Account.of(4, "微信支付4账户", true, "入款", UserFactory.getSimpleUsers(true)));
        accounts.add(Account.of(5, "微信支付5账户", false, "出款", UserFactory.getSimpleUsers(false)));
        accounts.add(Account.of(6, "微信支付6账户", false, "入款", UserFactory.getSimpleUsers(true)));
        accounts.add(Account.of(7, "微信支付7账户", false, "出款", UserFactory.getSimpleUsers(false)));
        accounts.add(Account.of(8, "微信支付8账户", true, "出款", UserFactory.getSimpleUsers(true)));
        accounts.add(Account.of(9, "微信支付9账户", true, "入款", UserFactory.getSimpleUsers(false)));
        accounts.add(Account.of(10, "微信支付10账户", true, "出款", UserFactory.getSimpleUsers(true)));
        accounts.add(Account.of(11, "微信支付11账户", true, "入款", UserFactory.getSimpleUsers(true)));
        accounts.add(Account.of(12, "微信支付12账户", false, "出款", UserFactory.getSimpleUsers(true)));

        return accounts;
    }

    public static List<Account> getSimpleABCAccounts() {

        List<Account> accounts = new ArrayList<>();

        accounts.add(Account.of(1, "微信支付1账户", false, false, true, true, "出款"));
        accounts.add(Account.of(2, "微信支付2账户", false, false, false, true, "入款"));
        accounts.add(Account.of(3, "微信支付3账户", true, false, true, false, "出款"));
        accounts.add(Account.of(4, "微信支付4账户", true, false, true, true, "入款"));
        accounts.add(Account.of(5, "微信支付5账户", false, false, false, false, "出款"));
        accounts.add(Account.of(6, "微信支付6账户", false, false, true, true, "入款"));
        accounts.add(Account.of(7, "微信支付7账户", false, false, false, false, "出款"));
        accounts.add(Account.of(8, "微信支付8账户", true, false, false, true, "出款"));
        accounts.add(Account.of(9, "微信支付9账户", true, false, true, true, "入款"));
        accounts.add(Account.of(10, "微信支付10账户", true, false, false, false, "出款"));
        accounts.add(Account.of(11, "微信支付11账户", true, false, false, true, "入款"));
        accounts.add(Account.of(12, "微信支付12账户", false, false, true, true, "出款"));

        return accounts;
    }

    public static void printAccount(List<Account> accounts) {
        for (Account account : accounts) {
            System.out.println("account = " + account);
        }
    }

    public static void printAccount(Map<String, List<Account>> accounts) {
        accounts.forEach((key, val) -> {
            System.out.println("groupName:" + key);
            for (Account account : val) {
                System.out.println("\t\t account:" + account);
            }
        });
    }
}
