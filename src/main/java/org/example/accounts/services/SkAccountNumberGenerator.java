package org.example.accounts.services;

import com.google.inject.Singleton;
import org.example.accounts.services.AccountNumberGenerator;

@Singleton
public class SkAccountNumberGenerator implements AccountNumberGenerator {
    @Override
    public String generateAccountNumber() {
        return "slovakian";
    }
}