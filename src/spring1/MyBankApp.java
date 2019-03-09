package spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBankApp {
    public static void main(String[] args) {
        //Account account = new CurrentAccount();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Account account = context.getBean("myAccount",Account.class);
        System.out.println(account.createAccount());
    }
}
