package org.example.accounts.validators;

import org.example.accounts.BankAccount;
import org.example.accounts.Interesting;
import org.example.people.Owner;

public class SavingsAccount extends BankAccount implements Interesting {
    private double interestRate;

    public SavingsAccount(double balance, Owner owner, String accountNumber, double interestRate) {
        super(balance, owner, accountNumber);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

}