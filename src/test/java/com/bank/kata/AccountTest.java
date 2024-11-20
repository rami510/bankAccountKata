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
}
