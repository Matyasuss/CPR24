package org.example;

import org.example.accounts.BankAccount;
import org.example.accounts.factories.BankAccountFactory;
import org.example.accounts.services.MoneyTransferService;
import org.example.people.Owner;
import org.example.people.OwnerFactory;
import org.example.print.AccountDetailPrinter;

public class App {
    public void run() {
        runBank();
    }

    void runBank() {
        OwnerFactory ownerFactory = new OwnerFactory();
        BankAccountFactory bankAccountFactory = new BankAccountFactory();

        Owner owner1 = ownerFactory.createOwner("John", "Doe", "1234567890");
        BankAccount basicBankAccount = bankAccountFactory.createBankAccount(1000, owner1);
        BankAccount studentBankAccount = bankAccountFactory.createStudentBankAccount(1000, owner1);

        new AccountDetailPrinter().printDetail(basicBankAccount);
        new AccountDetailPrinter().printDetail(studentBankAccount);
    }
}