package org.example.cards;

import com.google.inject.Inject;
import org.example.accounts.BankAccountFactory;

public class BankCardFacade {
    @Inject
    public BankCardFactory bankCardFactory;

    @Inject
    BankAccountFactory bankAccountFactory;

    @Inject
    public GlobalCardStorage globalCardStorage;


}