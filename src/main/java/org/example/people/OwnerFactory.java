package org.example.people;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.accounts.services.AccountNumberGenerator;
import org.example.accounts.services.BankAccountNumberGenerator;

@Singleton
public class OwnerFactory {
    private PersonIdValidator personIdValidator;

    private AccountNumberGenerator accountNumberGenerator;

    @Inject
    public OwnerFactory(PersonIdValidator personIdValidator, AccountNumberGenerator accountNumberGenerator) {
        this.personIdValidator = personIdValidator;
        this.accountNumberGenerator = accountNumberGenerator;
    }

    public Owner createOwner(String name, String surname, String id) {
        if(!this.personIdValidator.isPersonIdValid(id)) {
            throw new IllegalArgumentException("Invalid Id \uD83D\uDE2D");
        }

        System.out.println(this.accountNumberGenerator.generateAccountNumber());

        return new Owner(name, surname, id);
    }

}