package org.example.accounts.cards;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.accounts.cards.BankCard;
import org.example.accounts.cards.BankCardPinGenerator;
import org.example.accounts.cards.CardNumberGenerator;
import org.example.accounts.services.AccountNumberGenerator;
import org.example.accounts.BankAccount;
import org.example.people.Owner;

@Singleton
public class BankCardFactory {
    @Inject
    public CardNumberGenerator cardNumberGenerator;

    public static BankCard createBankCard() {
        return new BankCard(CardNumberGenerator.generateCardNumber(), BankCardPinGenerator.generatePinCode());
    }
}