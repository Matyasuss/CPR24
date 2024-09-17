package org.example;

import org.example.accounts.BankAccount;
import org.example.accounts.MoneyTransferService;
import org.example.people.Owner;

public class App {
    public void run() {
        runBank();
    }

    void runBank() {
        Owner person1 = new Owner("Emil", "Hacha");
        Owner person2 = new Owner("John", "Smith");
        BankAccount bankAccount1 = new BankAccount(500, person1, "CZ00136861234567547");
        BankAccount bankAccount2 = new BankAccount(800, person2, "CZ55862577221155215");

        MoneyTransferService moneyTransferService = new MoneyTransferService();

        //moneyTransferService.depositMoney(bankAccount1, 500);
        //moneyTransferService.withdrawMoney(bankAccount2, 500);
        moneyTransferService.TrasferMoney(bankAccount1, bankAccount2, 300);
        boolean isInDebt = bankAccount1.getBalance() < 0;
        if(isInDebt) {
            System.out.printf("this guy %s is in debt", bankAccount1.getOwner().getFirstname());
        }
    }
}