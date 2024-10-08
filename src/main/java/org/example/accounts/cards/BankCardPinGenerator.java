package org.example.accounts.cards;

import com.google.inject.Singleton;
import org.example.accounts.services.AccountNumberGenerator;

import java.util.Random;

@Singleton
public class BankCardPinGenerator {

    public static String generatePinCode() {
        Random random = new Random();

        StringBuilder pinCode = new StringBuilder();
        for (int i = 0; i <= 4; i++) {
            pinCode.append(random.nextInt(10));
        }

        return pinCode.toString();
    }
}