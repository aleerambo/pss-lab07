package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.AccountHolder;
import it.unibo.inheritance.api.BankAccount;

public abstract class AbstractBankAccount implements BankAccount {
    public static final double ATM_TRANSACTION_FEE = 1;
    public static final double MANAGEMENT_FEE = 5;

    private final AccountHolder holder;
    private double balance;
    private int transactions;

    public AbstractBankAccount(final AccountHolder accountHolder, final double balance) {
        this.holder = accountHolder;
        this.balance = balance;
        this.transactions = 0;
    }

    public void chargeManagementFees(int id) {
        if (checkUser(id)) {
            this.balance -= this.computeFees();
            resetTransactions();
        }
    }

    public void deposit(int id, double amount) {
        this.transactionOp(id, amount);
    }

    public void depositFromATM(int id, double amount) {
        this.deposit(id, amount - AbstractBankAccount.ATM_TRANSACTION_FEE);
    }

    public AccountHolder getAccountHolder() {
        return holder;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getTransactionsCount() {
        return this.transactions;
    }

    public void withdraw(int id, double amount) {
        if(isWithDrawAllowed(amount)) {
            this.transactionOp(id, -amount);
        }
    }

    public void withdrawFromATM(int id, double amount) {
        this.withdraw(id, amount + AbstractBankAccount.ATM_TRANSACTION_FEE);
    }

    protected boolean checkUser(final int id) {
        return this.getAccountHolder().getUserID() == id;
    }

    protected void incrementTransactions() {
        this.transactions++;
    }

    protected void resetTransactions() {
        this.transactions = 0;
    }

    private void transactionOp(final int id, final double amount) {
        if (checkUser(id)) {
            this.balance += amount;
            this.incrementTransactions();
        }
    }

    protected abstract boolean isWithDrawAllowed(double amount);

    protected abstract double computeFees();
}
