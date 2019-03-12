package spring1.model;

import spring1.Account;
import spring1.Card;

public class SavingAccount implements Account {

    private Card atmCard;

    public SavingAccount(Card card) {
        atmCard = card;
    }

    @Override
    public String createAccount() {
        return "Saving account created successfully.";
    }

    @Override
    public String cardDetails() {
        return atmCard.cardDetails();
    }
}
