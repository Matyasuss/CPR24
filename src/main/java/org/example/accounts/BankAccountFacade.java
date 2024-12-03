package org.example.accounts;

import com.google.inject.Inject;
import org.example.cards.BankCard;
import org.example.cards.BankCardFactory;
import org.example.people.Owner;

public class BankAccountFacade {
    @Inject
    public BankAccountFactory BankAccountFactory;

    @Inject
    public BankCardFactory bankCardFactory;

    public BankAccount createBankAccount(double balance, Owner owner) {
        BankAccount bankAccount = BankAccountFactory.createBankAccount(balance, owner);
        BankCard bankCard = bankCardFactory.createDebitCard();

        bankAccount.associateBankCard(bankCard);

        return bankAccount;
    }

    public SavingsAccount createSavingBankAccount(double balance, Owner owner, String accountNumber) {
        SavingsAccount account = BankAccountFactory.createSavingBankAccount(balance, owner, accountNumber, 4);

        return account;
    }
}