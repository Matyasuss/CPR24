package org.example.accounts.services;

import com.google.inject.Singleton;
import org.example.accounts.services.AccountNumberGenerator;

import java.util.Random;

@Singleton
public class BankAccountNumberGenerator implements AccountNumberGenerator {
    @Override
    public String generateAccountNumber() {
        Random random = new Random();

        StringBuilder accountNumber = new StringBuilder();
        for (int i = 0; i <= 10; i++) {
            accountNumber.append(random.nextInt(10));
        }

        return accountNumber.toString();
    }
}