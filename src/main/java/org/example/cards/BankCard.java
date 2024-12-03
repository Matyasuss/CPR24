package org.example.cards;

import org.example.accounts.BankAccount;

public class BankCard {
    private String number;
    private String personalIdentificationNumber;
    private BankAccount bankAccount;

    public BankCard(String cardNumber, String cardPIN) {
        if (cardNumber.length() != 16) {
            throw new IllegalArgumentException("too short card number");
        }

        this.number = cardNumber;
        this.personalIdentificationNumber = cardPIN;
    }

    public String getNumber() {
        return number;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public String getPersonalIdentificationNumber() {
        return personalIdentificationNumber;
    }
}