package org.example.people;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.accounts.AccountNumberGenerator;

@Singleton
public class OwnerFactory {
    @Inject
    public PersonIdValidator personIdValidator;

    @Inject
    public AccountNumberGenerator accountNumberGenerator;

    public OwnerFactory() {}

    public Owner createOwner(String name, String surname, String id) {
        if(!this.personIdValidator.isPersonIdValid(id)) {
            throw new IllegalArgumentException("Invalid Id");
        }

        return new Owner(name, surname, id);
    }

}