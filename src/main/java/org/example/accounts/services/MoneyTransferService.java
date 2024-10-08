package org.example.accounts.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.accounts.BankAccount;
import org.example.accounts.exceptions.NotEnoughMoneyException;
import org.example.print.AccountDetailPrinter;

@Singleton
public class MoneyTransferService {

    public TransferFeeCalculator transferFeeCalculator;
    public AccountDetailPrinter accountDetailPrinter;

    @Inject
    public MoneyTransferService(TransferFeeCalculator transferFeeCalculator, AccountDetailPrinter accountDetailPrinter) {
        this.transferFeeCalculator = transferFeeCalculator;
        this.accountDetailPrinter = accountDetailPrinter;
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

    public void transferMoney(BankAccount sender, BankAccount beneficiary, double amount) {
        double balance = sender.getBalance();
        double newBalance = balance - amount;

        newBalance += this.transferFeeCalculator.calculateTransferFee(amount);

        if(balance < amount) {
            throw new NotEnoughMoneyException();
        }

        sender.setBalance(newBalance);
        beneficiary.setBalance(beneficiary.getBalance() + amount);
        accountDetailPrinter.printDetail(sender);
        accountDetailPrinter.printDetail(beneficiary);
    }
}