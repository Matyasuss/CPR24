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
        return new BankAccount(balance, owner, accountNumber);
    }

    public BankAccount createBankAccount(double balance, Owner owner) {
        BankAccount account = new BankAccount(balance, owner, bankAccountNumberGenerator.generateAccountNumber());
        addCard(account);
        return account;
    }

    public BankAccount createStudentBankAccount(double balance, Owner owner, String accountNumber) {
        BankAccount account = new BankAccount(balance, owner, accountNumber);
        addCard(account);
        return account;
    }

    public BankAccount createStudentBankAccount(double balance, Owner owner) {
        BankAccount account = new BankAccount(balance, owner, bankAccountNumberGenerator.generateAccountNumber());
        addCard(account);
        return account;
    }

    public void addCard (BankAccount account) {
        BankCard card = bankCardFactory.createBankCard(account);
        account.cards.put(card.getCardNumber(), card);
    }
}