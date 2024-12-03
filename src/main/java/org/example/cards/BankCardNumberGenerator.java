package org.example.cards;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Random;

@Singleton
public class BankCardNumberGenerator implements CardNumberGenerator {
    @Inject
    public Random random;

    @Override
    public String generate() {
        StringBuilder cardNumberBuilder = new StringBuilder();

        for (int i = 0; i < 15; i++) {
            cardNumberBuilder.append(random.nextInt(10));
        }

        return cardNumberBuilder.toString();
    }
}
