package com.bank.kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AccountTest {
    @Test
    public void should_add_deposit_to_balance() {
        Account account = new Account();
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }


    @Test
    public void should_subtract_withdrawal_from_balance() {
        Account account = new Account();
        account.deposit(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }
}
