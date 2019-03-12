package spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBankApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Account account1 = context.getBean("myAccount",Account.class);
        Account account2 = context.getBean("myAccount",Account.class);
//        System.out.println(account.createAccount());
//        System.out.println(account.cardDetails());
        System.out.println("Account 1 == Account 2: " + (account1==account2));
        System.out.println("Account 1: " + account1);
        System.out.println("Account 2: " + account2);

    }
}
