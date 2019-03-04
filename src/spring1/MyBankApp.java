package spring1;

import spring1.model.CurrentAccount;
import spring1.model.SavingAccount;

public class MyBankApp {
    public static void main(String[] args) {
        Account account = new CurrentAccount();
        System.out.println(account.createAccount());
    }
}
