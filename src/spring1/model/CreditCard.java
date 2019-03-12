package spring1.model;

import spring1.Card;

public class CreditCard implements Card {

    @Override
    public String cardDetails() {
        return "Credit Card issued.";
    }
}
