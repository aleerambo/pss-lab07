package it.unibo.inheritance.impl;

import it.unibo.inheritance.AbstractBankAccount;
import it.unibo.inheritance.api.AccountHolder;

public class RestrictedBankAccount extends AbstractBankAccount {
    private static final double TRANSACTION_FEE = 0.1;

    public RestrictedBankAccount(final AccountHolder accountHolder, final double balance) {
        super(accountHolder, balance);
    }

    @Override
    protected boolean isWithDrawAllowed(double amount) {
        return getBalance() >= amount;
    }

    @Override
    protected double computeFees() {
        return MANAGEMENT_FEE + getTransactionsCount() * TRANSACTION_FEE;
    }
}
