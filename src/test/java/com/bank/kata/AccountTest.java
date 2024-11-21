package com.bank.kata;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AccountTest {

    private LocalDate today;

    @Before
    public void setup() {
        today = LocalDate.now();
    }
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

    @Test
    public void should_throw_exception_when_deposit_amount_is_negative() {
        Account account = new Account();
        InvalidAmountException exception = assertThrows(
                InvalidAmountException.class,
                () -> account.deposit(-100)
        );
        assertEquals(Constants.INVALID_DEPOSIT_MESSAGE, exception.getMessage());
    }

    @Test
    public void should_throw_exception_when_withdrawal_amount_is_zero() {
        Account account = new Account();
        InvalidAmountException exception = assertThrows(
                InvalidAmountException.class,
                () -> account.withdraw(0)
        );
        assertEquals(Constants.INVALID_WITHDRAWAL_MESSAGE, exception.getMessage());
    }

    @Test
    public void should_throw_exception_when_withdrawal_amount_is_negative() {
        Account account = new Account();
        InvalidAmountException exception = assertThrows(
                InvalidAmountException.class,
                () -> account.withdraw(-50)
        );
        assertEquals(Constants.INVALID_WITHDRAWAL_MESSAGE, exception.getMessage());
    }

    @Test
    public void should_throw_exception_when_withdrawal_exceeds_balance() {
        Account account = new Account();
        account.deposit(100);
        InsufficientBalanceException exception = assertThrows(
                InsufficientBalanceException.class,
                () -> account.withdraw(200)
        );
        assertEquals(Constants.INSUFFICIENT_BALANCE_MESSAGE, exception.getMessage());
    }

    @Test
    public void should_record_transactions_in_transaction_history() {
        Account account = new Account();
        account.deposit(300);
        account.withdraw(100);
        String expectedStatement = String.format("""
            Date       | Amount | Balance
            %s | +300   | 300
            %s | -100   | 200
            """, today, today);

        assertEquals(expectedStatement.trim(), account.getStatement());
    }

}

