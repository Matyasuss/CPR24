package org.example.accounts;

import org.example.accounts.Interesting;
import org.example.accounts.cards.BankCard;
import org.example.accounts.cards.BankCardFactory;
import org.example.people.Owner;

public class SavingsAccount extends BankAccount implements Interesting {
    private double interestRate;

    public SavingsAccount(double balance, Owner owner, String accountNumber, double interestRate) {
        super(balance, owner, accountNumber, BankCardFactory.createBankCard());
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

}