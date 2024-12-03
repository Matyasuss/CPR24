package org.example.cards;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class BankCardFactory {
    @Inject
    CardNumberGenerator CardNumberGenerator;

    @Inject
    GlobalCardStorage globalCardStorage;

    @Inject
    PersonalIdentificationNumberGenerator PersonalIdentificationNumberGenerator;


    public DebitCard createDebitCard() {
        DebitCard debitCard = new DebitCard(
                this.CardNumberGenerator.generate(),
                this.PersonalIdentificationNumberGenerator.generate()
        );

        this.globalCardStorage.put(debitCard);

        return debitCard;
    }

    public BankCard findBankCard(String number) {
        return this.globalCardStorage.get(number);
    }
}