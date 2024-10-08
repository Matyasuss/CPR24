package org.example;
import com.google.inject.AbstractModule;
import org.example.accounts.services.AccountNumberGenerator;
import org.example.accounts.services.SkAccountNumberGenerator;

public class BankInjector extends AbstractModule {

    @Override
    protected void configure() {
        this.bind(AccountNumberGenerator.class).to(SkAccountNumberGenerator.class);
    }

}
