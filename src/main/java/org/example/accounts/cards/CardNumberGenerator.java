package org.example.accounts.cards;

import com.google.inject.Singleton;
import org.example.accounts.services.AccountNumberGenerator;

import java.util.Random;

@Singleton
public class CardNumberGenerator {

    public static String generateCardNumber() {
        Random random = new Random();

        StringBuilder cardNumber = new StringBuilder();
        for (int i = 0; i <= 6; i++) {
            cardNumber.append(random.nextInt(10));
        }

        return cardNumber.toString();
    }
}