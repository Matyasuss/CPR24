package org.example.accounts.factories;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.accounts.cards.BankCard;
import org.example.accounts.services.AccountNumberGenerator;
import org.example.accounts.BankAccount;
import org.example.people.Owner;
import org.example.accounts.cards.BankCardFactory;

@Singleton
public class BankAccountFactory {
    @Inject
    public AccountNumberGenerator bankAccountNumberGenerator;
    public BankCardFactory bankCardFactory;

    public BankAccount createBankAccount(double balance, Owner owner, String accountNumber) {
        return new BankAccount(balance, owner, accountNumber, BankCardFactory.createBankCard());
    }

    public BankAccount createBankAccount(double balance, Owner owner) {
        return new BankAccount(balance, owner, bankAccountNumberGenerator.generateAccountNumber(), BankCardFactory.createBankCard());
    }

    public BankAccount createStudentBankAccount(double balance, Owner owner, String accountNumber) {
        return new BankAccount(balance, owner, accountNumber, BankCardFactory.createBankCard());
    }

    public BankAccount createStudentBankAccount(double balance, Owner owner) {
        return new BankAccount(balance, owner, bankAccountNumberGenerator.generateAccountNumber(), BankCardFactory.createBankCard());
    }
}