package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;

public class ClassicBankAccount extends AbstractBankAccount {
    public ClassicBankAccount(final AccountHolder accountHolder, final double balance) {
        super(accountHolder, balance);
    }

    @Override
    protected boolean isWithDrawAllowed(double amount) {
        return true;
    }

    @Override
    protected double computeFees() {
        return MANAGEMENT_FEE;
    }
}
