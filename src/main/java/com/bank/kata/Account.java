package com.bank.kata;


public class Account {
    private int balance;
    private final TransactionHistory transactionHistory = new TransactionHistory();

    public void deposit(int amount) {
        if (amount <= 0) throw new InvalidAmountException("Deposit amount must be positive.");
        balance += amount;
        transactionHistory.recordTransaction(new Transaction(amount, balance));
    }

    public void withdraw(int amount) {
        if (amount <= 0) throw new InvalidAmountException("Withdrawal amount must be positive.");
        if (amount > balance) throw new InsufficientBalanceException("Insufficient balance for withdrawal.");
        balance -= amount;
        transactionHistory.recordTransaction(new Transaction(-amount, balance));
    }

    public int getBalance() {
        return balance;
    }

    public String getStatement() {
        return transactionHistory.printStatement();
    }
}
