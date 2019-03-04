package spring1.model;

import spring1.Account;

public class SavingAccount implements Account {

    @Override
    public String createAccount() {
        return "Saving account created successfully.";
    }
}
