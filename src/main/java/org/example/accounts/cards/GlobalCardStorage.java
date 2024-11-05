package org.example.accounts.cards;
import java.util.HashMap;
import com.google.inject.Singleton;

@Singleton
public class GlobalCardStorage {
    public HashMap<String, BankCard> GlobalCards = new HashMap<String, BankCard>();
    public void put(BankCard card) {
        this.GlobalCards.put(card.getCardNumber(), card);
    }

    public BankCard get(String number) {
        return this.GlobalCards.get(number);
    }
}