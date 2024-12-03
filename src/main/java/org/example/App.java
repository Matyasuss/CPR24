package org.example;

import com.google.inject.Inject;
import org.example.accounts.BankAccountFacade;
import org.example.accounts.interest.InterestingService;
import org.example.people.Owner;
import org.example.people.OwnerFactory;
import org.example.people.OwnerJsonSerializationService;
import org.example.print.AccountDetailPrinter;

import java.util.Date;

public class App {
    public void run() {
        runBank();
    }

    @Inject
    OwnerFactory ownerFactory;

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

    void runBank() {
        Owner owner = ownerFactory.createOwner("Pepa", "Doe", "11");


    }
}