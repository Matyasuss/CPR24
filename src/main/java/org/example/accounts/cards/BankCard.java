package org.example.accounts.cards;

public class BankCard {

    private String cardNumber;
    private String cardPin;

    public BankCard(String cardNumber, String cardPin) {
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardPin(String cardPin) {
        return cardPin;
    }
}