package org.example;

import com.google.inject.AbstractModule;
import org.example.accounts.AccountNumberGenerator;
import org.example.cards.BankCardNumberGenerator;
import org.example.cards.CardNumberGenerator;
import org.example.cards.PersonalIdentificationNumberGenerator;
import org.example.accounts.BankAccountNumberGenerator;
import org.example.cards.BankCardPersonalIdentificationNumberGenerator;

public class BankModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(AccountNumberGenerator.class).to(BankAccountNumberGenerator.class);
        bind(PersonalIdentificationNumberGenerator.class).to(BankCardPersonalIdentificationNumberGenerator.class);
        bind(CardNumberGenerator.class).to(BankCardNumberGenerator.class);
    }
}