package org.example;

import com.google.inject.AbstractModule;
import org.example.accounts.services.AccountNumberGenerator;
import org.example.accounts.services.SkAccountNumberGenerator;

public class BankModule extends AbstractModule {
    @Override
    protected void configure() {
        // bind(AccountNumberGenerator.class).to(BankAccountNumberGenerator.class);
        bind(AccountNumberGenerator.class).to(SkAccountNumberGenerator.class);
    }
}