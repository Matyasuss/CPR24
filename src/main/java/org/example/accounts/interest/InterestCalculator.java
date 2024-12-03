package org.example.accounts.interest;

import org.example.accounts.SavingsAccount;

public class InterestCalculator {
    public double calculateInterest(SavingsAccount bankAccount) {
        return bankAccount.getBalance() * (bankAccount.getInterestRate() / 100);
    }
}