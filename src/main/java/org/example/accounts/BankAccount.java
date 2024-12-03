package org.example.accounts;

import org.example.cards.BankCard;
import org.example.people.Owner;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;

    private Owner owner;

    private String accountNumber;

    private List<BankCard> bankCards = new ArrayList<BankCard>();

    public BankAccount(double balance, Owner owner, String accountNumber) {
        this.balance = balance;
        this.owner = owner;
        this.accountNumber = accountNumber;
    }

    public void associateBankCard(BankCard bankCard) {
        bankCard.setBankAccount(this);
        this.bankCards.add(bankCard);
    }

    public List<BankCard> getBankCards() {
        return this.bankCards;
    }

    public double getBalance() {
        return this.balance;
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