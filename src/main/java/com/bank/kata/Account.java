package com.bank.kata;

public class Account {
    private int balance;

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new InvalidAmountException(Constants.INVALID_DEPOSIT_MESSAGE);
        }
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            throw new InvalidAmountException(Constants.INVALID_WITHDRAWAL_MESSAGE);
        }
        if (amount > balance) {
            throw new InsufficientBalanceException(Constants.INSUFFICIENT_BALANCE_MESSAGE);
        }
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}