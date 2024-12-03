package org.example.print;

import org.example.accounts.BankAccount;
import org.example.cards.BankCard;

public class AccountDetailPrinter {
    public void printDetail(BankAccount bankAccount) {
        // print this prettily
        System.out.println("===");

        System.out.print("Account owner: ");
        System.out.print(bankAccount.getOwner().getLastname());
        System.out.print(" ");
        System.out.println(bankAccount.getOwner().getFirstname());

        System.out.print("Account number: ");
        System.out.println(bankAccount.getAccountNumber());

        System.out.print("Balance: ");
        System.out.println(bankAccount.getBalance());

        System.out.println();

        if(!bankAccount.getBankCards().isEmpty()) {
            System.out.println("Associated payment cards: ");

            for(BankCard bankCard : bankAccount.getBankCards()) {
                String censoredAccountNumber = "****" + bankCard.getNumber().substring(12, 16) + " (PIN: " + bankCard.getPersonalIdentificationNumber() + ")";
                System.out.println(censoredAccountNumber);
            }
        }

        System.out.println("===");
    }
}