package it.unibo.inheritance.impl;

import it.unibo.inheritance.AbstractBankAccount;
import it.unibo.inheritance.api.AccountHolder;

public class ClassicBankAccount extends AbstractBankAccount {
    public ClassicBankAccount(final AccountHolder accountHolder, final double balance) {
        super(accountHolder, balance);
    }
}
