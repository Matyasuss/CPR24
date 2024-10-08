package org.example;

import com.google.gson.Gson;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.example.accounts.factories.BankAccountFactory;
import org.example.accounts.services.AccountNumberGenerator;
import org.example.accounts.services.BankAccountNumberGenerator;
    import org.example.accounts.services.MoneyTransferService;
import org.example.accounts.services.TransferFeeCalculator;
import org.example.people.OwnerFactory;
import org.example.people.PersonIdValidator;
import org.example.print.AccountDetailPrinter;

@Singleton
public class DIContainer {
    private AccountNumberGenerator accountNumberGenerator = new BankAccountNumberGenerator();
    private PersonIdValidator personIdValidator = new PersonIdValidator();
    private AccountDetailPrinter accountDetailPrinter = new AccountDetailPrinter();
    private TransferFeeCalculator transferFeeCalculator = new TransferFeeCalculator();
    private MoneyTransferService moneyTransferService = new MoneyTransferService(transferFeeCalculator, accountDetailPrinter);

    public Gson getGson() {
        return gson;
    }

    private Gson gson = new Gson();

    private OwnerFactory ownerFactory = new OwnerFactory(personIdValidator, accountNumberGenerator);
    @Inject
    private BankAccountFactory bankAccountFactory;

    public AccountNumberGenerator getAccountNumberGenerator() {
        return accountNumberGenerator;
    }

    public PersonIdValidator getPersonIdValidator() {
        return personIdValidator;
    }

    public AccountDetailPrinter getAccountDetailPrinter() {
        return accountDetailPrinter;
    }

    public TransferFeeCalculator getTransferFeeCalculator() {
        return transferFeeCalculator;
    }

    public MoneyTransferService getMoneyTransferService() {
        return moneyTransferService;
    }

    public OwnerFactory getOwnerFactory() {
        return ownerFactory;
    }

    public BankAccountFactory getBankAccountFactory() {
        return bankAccountFactory;
    }
}