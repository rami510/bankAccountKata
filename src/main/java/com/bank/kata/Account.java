package com.bank.kata;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int balance;
    private final List<Transaction> transactions = new ArrayList<>();

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new InvalidAmountException(Constants.INVALID_DEPOSIT_MESSAGE);
        }
        balance += amount;
        transactions.add(new Transaction(amount, balance));
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            throw new InvalidAmountException(Constants.INVALID_WITHDRAWAL_MESSAGE);
        }
        if (amount > balance) {
            throw new InsufficientBalanceException(Constants.INSUFFICIENT_BALANCE_MESSAGE);
        }
        balance -= amount;
        transactions.add(new Transaction(-amount, balance));
    }

    public int getBalance() {
        return balance;
    }

    public String getStatement() {
        StringBuilder statement = new StringBuilder("Date       | Amount | Balance\n");
        for (Transaction transaction : transactions) {
            statement.append(transaction).append("\n");
        }
        return statement.toString().trim();
    }

    // Méthode d'impression directe dans la console
    public void printStatement() {
        System.out.println(getStatement());
    }
}