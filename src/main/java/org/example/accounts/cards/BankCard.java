package org.example.accounts.cards;

import org.example.accounts.BankAccount;

public class BankCard {

    private String cardNumber;
    private String cardPin;
    private BankAccount account;

    public BankCard(String cardNumber, String cardPin, BankAccount account) {
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
        this.account = account;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardPin(String cardPin) {
        return cardPin;
    }

    public BankAccount getAccountNumber() {
        return account;
    }
}