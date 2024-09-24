package org.example.accounts.factories;

import org.example.accounts.BankAccount;
import org.example.accounts.services.BankAccountNumberGenerator;
import org.example.people.Owner;

public class BankAccountFactory {
    public BankAccountNumberGenerator bankAccountNumberGenerator;

    public BankAccountFactory() {
        this.bankAccountNumberGenerator = new BankAccountNumberGenerator();
    }

    public BankAccount createBankAccount(double balance, Owner owner, String accountNumber) {
        return new BankAccount(balance, owner, accountNumber);
    }

    public BankAccount createBankAccount(double balance, Owner owner) {
        return new BankAccount(balance, owner, bankAccountNumberGenerator.generateAccountNumber());
    }

    public BankAccount createStudentBankAccount(double balance, Owner owner, String accountNumber) {
        return new BankAccount(balance, owner, accountNumber);
    }

    public BankAccount createStudentBankAccount(double balance, Owner owner) {
        return new BankAccount(balance, owner, bankAccountNumberGenerator.generateAccountNumber());
    };
}