package it.unibo.bank.impl;

import it.unibo.bank.api.AccountHolder;
import it.unibo.bank.api.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static it.unibo.bank.impl.SimpleBankAccount.*;
import static it.unibo.bank.impl.SimpleBankAccount.ATM_TRANSACTION_FEE;
import static it.unibo.bank.impl.StrictBankAccount.TRANSACTION_FEE;
import static org.junit.jupiter.api.Assertions.*;

public class TestStrictBankAccount {

    private final static int INITIAL_AMOUNT = 100;

    // 1. Create a new AccountHolder and a StrictBankAccount for it each time tests are executed.
    private AccountHolder mRossi;
    private BankAccount bankAccount;

    @BeforeEach
    public void setUp() {
        fail();
    }

    // 2. Test the initial state of the StrictBankAccount
    @Test
    public void testInitialization() {
        fail();
    }


    // 3. Perform a deposit of 100€, compute the management fees, and check that the balance is correctly reduced.
    @Test
    public void testManagementFees() {
        fail();
    }

    // 4. Test the withdraw of a negative value
    @Test
    public void testNegativeWithdraw() {
        fail();
    }

    // 5. Test withdrawing more money than it is in the account
    @Test
    public void testWithdrawingTooMuch() {
        fail();
    }
}
