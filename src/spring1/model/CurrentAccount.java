package spring1.model;

import spring1.Account;
import spring1.Card;

public class CurrentAccount implements Account {

    private Card creditCard;

    public void setCreditCard(Card creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public String createAccount() {
        return "Current Account created succesfully";
    }

    @Override
    public String cardDetails() {
        return this.creditCard.cardDetails();
    }
}
