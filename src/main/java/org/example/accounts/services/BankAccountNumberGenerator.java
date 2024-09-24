package org.example.accounts.services;

import java.util.Random;

public class BankAccountNumberGenerator {
    public String generateAccountNumber() {
        Random random = new Random();

        StringBuilder accountNumber = new StringBuilder();
        for (int i = 0; i <= 10; i++) {
            accountNumber.append(random.nextInt(10));
        }

        return accountNumber.toString();
    }
}