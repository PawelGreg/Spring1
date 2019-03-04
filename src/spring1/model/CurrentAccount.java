package spring1.model;

import spring1.Account;

public class CurrentAccount implements Account {
    @Override
    public String createAccount() {
        return "Current Account created succesfully";
    }
}
