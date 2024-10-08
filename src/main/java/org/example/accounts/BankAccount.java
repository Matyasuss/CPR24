package org.example.accounts;

import org.example.accounts.cards.BankCard;
import org.example.people.Owner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankAccount {
    private double balance;

    private Owner owner;

    private String accountNumber;

    private Map<String, BankCard> cards = new HashMap<String, BankCard>();

    public BankAccount(double balance, Owner owner, String accountNumber, BankCard card) {
        this.balance = balance;
        this.owner = owner;
        this.accountNumber = accountNumber;
        cards.put(card.getCardNumber(), card);
    }

    public double getBalance() {
        return balance;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}