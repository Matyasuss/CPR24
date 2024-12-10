package org.example;

import com.google.inject.Inject;
import org.example.accounts.BankAccount;
import org.example.accounts.BankAccountFacade;
import org.example.accounts.BankAccountFactory;
import org.example.accounts.SavingsAccount;
import org.example.accounts.interest.InterestingService;
import org.example.cards.BankCard;
import org.example.cards.BankCardFactory;
import org.example.people.Owner;
import org.example.people.OwnerFactory;
import org.example.people.OwnerJsonSerializationService;
import org.example.print.AccountDetailPrinter;

public class App {
    public void run() {
        runBank();
    }

    @Inject
    OwnerFactory ownerFactory;

    @Inject
    BankAccountFactory bankAccountFactory;

    @Inject
    BankAccountFacade bankAccountFacade;

    @Inject
    AccountDetailPrinter accountDetailPrinter;

    @Inject
    OwnerJsonSerializationService ownerJsonSerializationService;

    @Inject
    AtmService atmService;

    @Inject
    InterestingService interestingService;

    @Inject
    BankCardFactory debitCardFactory;

    void runBank() {
        Owner owner1 = ownerFactory.createOwner("Pepa", "Doe", "11");

        BankAccount bankAccount = bankAccountFacade.createBankAccount(100, owner1);
        BankAccount firstBankAccount = this.bankAccountFactory.createBankAccount(1000, owner1);
        // create a payment card
        BankCard paymentCard = this.debitCardFactory.createDebitCard();

        firstBankAccount.associateBankCard(paymentCard);

        accountDetailPrinter.printDetail(bankAccount);

        SavingsAccount savingsAccount = bankAccountFacade.createSavingBankAccount(1000, owner1, "4321");
        // add interest
        this.interestingService.calculate();

        accountDetailPrinter.printDetail(savingsAccount);
    }
}
