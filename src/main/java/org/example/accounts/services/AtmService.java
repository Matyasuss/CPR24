package org.example.accounts.services;

import com.google.inject.Inject;
import org.example.accounts.cards.BankCard;
import org.example.accounts.services.MoneyTransferService;

public class AtmService {
    @Inject
    MoneyTransferService moneyTransferService;

    public void withdraw (BankCard card, int amount) {
        moneyTransferService.withdrawMoney(card.getAccountNumber(), amount);
    }

    public void deposit(BankCard card, int amount) {
        moneyTransferService.depositMoney(card.getAccountNumber(), amount);
    }
}
