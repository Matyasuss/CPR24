package org.example;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.accounts.StudentBankAccount;
import org.example.accounts.services.*;
import org.example.accounts.BankAccount;
import org.example.accounts.factories.BankAccountFactory;
import org.example.people.Owner;
import org.example.people.OwnerFactory;
import org.example.people.OwnerJsonSerializationService;
import org.example.people.PersonIdValidator;
import org.example.print.AccountDetailPrinter;

public class App {
    public void run() {
        runBank();
    }

    @Inject
    private OwnerJsonSerializationService ownerJsonSerializationService;

    @Inject
    private OwnerFactory ownerFactory;

    @Inject
    private BankAccountFactory bankAccountFactory;

    @Inject
    private MoneyTransferService moneyTransferService;

    void runBank() {

        Owner owner1 = this.ownerFactory.createOwner("John", "Doe", "558647760");
        BankAccount account1 = this.bankAccountFactory.createBankAccount(3000, owner1);
        BankAccount account2 = this.bankAccountFactory.createStudentBankAccount(1000, owner1);

        System.out.println(this.ownerJsonSerializationService.serializeOwner(owner1));
        if (account2 instanceof StudentBankAccount) {
            String expire = ((StudentBankAccount) account2).getStudentStudiesConfirmationExpiresAt();
            System.out.println(expire);
        }
    }
}