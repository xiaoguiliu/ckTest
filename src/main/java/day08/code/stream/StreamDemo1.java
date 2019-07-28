package day08.code.stream;

import day08.code.stream.pojo.Account;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @ClassName StreamDemo1
 * @Author 小鬼
 * @Date 2019/7/23 21:00
 * @Description
 * @Version V1.0
 **/
public class StreamDemo1 {
//    原始写法
    @Test
    public void test1(){
        List<Account> Accounts = AccountFactory.getSimpleAccounts();
        List<Account> acc = new ArrayList<>();
        for(Account account:Accounts){
            if (account.isInner()){
                acc.add(account);
            }
        }
        AccountFactory.printAccount(acc);
    }

//    Stream写法
    @Test
    public void test2(){
        List<Account> accounts = AccountFactory.getSimpleAccounts();
        List<Account> acc =  accounts.stream()
                .filter(Account::isInner)
                .collect(Collectors.toList());
        AccountFactory.printAccount(acc);
    }
    /**
    * @Author 小鬼
    * @Date  2019/7/23 21:40
    * @Param
    * @return  普通方式实现数据分组
    **/
    @Test
    public void test3(){
        List<Account> accounts = AccountFactory.getSimpleAccounts();
        Map<String,List<Account>> group = new HashMap<>();
        for (Account account:accounts) {
            if (group.containsKey(account.getType())){
                //System.out.println(group.containsKey(account.getType()));
                group.get(account.getType()).add(account);
                //System.out.println("map的get方法返回key的值："+group.get(account.getType()));
            }else{
                List<Account> acc = new ArrayList<>();
                acc.add(account);
                group.put(account.getType(),acc);
            }
        }
    }
}
