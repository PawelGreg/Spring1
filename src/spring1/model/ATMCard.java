package spring1.model;

import spring1.Card;

public class ATMCard implements Card {

    @Override
    public String cardDetails() {
        return "ATM Card Issued";
    }
}
