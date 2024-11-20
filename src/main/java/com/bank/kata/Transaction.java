package com.bank.kata;

import java.time.LocalDate;

public class Transaction {
    private final LocalDate date;
    private final int amount;
    private final int balance;

    public Transaction(int amount, int balance) {
        this.date = LocalDate.now();
        this.amount = amount;
        this.balance = balance;
    }

    @Override
    public String toString() {
        String formattedAmount = (amount > 0 ? "+" : "") + amount;
        return date+" | "+formattedAmount+"   | "+balance;
    }
}
