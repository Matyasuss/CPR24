package org.example.accounts;

import org.example.print.AccountDetailPrinter;

public class MoneyTransferService {

    public TransferFeeCalculator transferFeeCalculator;
    public AccountDetailPrinter accountDetailPrinter;

    public MoneyTransferService() {
        this.transferFeeCalculator = new TransferFeeCalculator();
        this.accountDetailPrinter = new AccountDetailPrinter();
    }


    public void depositMoney(BankAccount bankAccount, double amount) {
        double balance = bankAccount.getBalance();
        double newBalance = balance + amount;

        newBalance -= this.transferFeeCalculator.calculateTransferFee(amount);

        bankAccount.setBalance(newBalance);
        accountDetailPrinter.printDetail(bankAccount);
    }

    public void withdrawMoney(BankAccount bankAccount, double amount) {
        double balance = bankAccount.getBalance();
        double newBalance = balance - amount;

        newBalance += this.transferFeeCalculator.calculateTransferFee(amount);

        bankAccount.setBalance(newBalance);
        accountDetailPrinter.printDetail(bankAccount);
    }

    public void TrasferMoney(BankAccount bankAccount_from,BankAccount bankAccount_to, double amount) {
        accountDetailPrinter.printDetail(bankAccount_from);
        accountDetailPrinter.printDetail(bankAccount_to);

        double balance = bankAccount_from.getBalance();
        double newBalance = balance - amount;

        newBalance += this.transferFeeCalculator.calculateTransferFee(amount);

        bankAccount_from.setBalance(newBalance);

        double balance2 = bankAccount_to.getBalance();
        double newBalance2 = balance + amount;

        bankAccount_to.setBalance(newBalance2);

        accountDetailPrinter.printDetail(bankAccount_from);
        accountDetailPrinter.printDetail(bankAccount_to);
    }
}