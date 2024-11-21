package com.bank.kata;

import java.util.ArrayList;
import java.util.List;

public class TransactionHistory {
    private final List<Transaction> transactions = new ArrayList<>();

    public void recordTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public String printStatement() {
        StringBuilder statement = new StringBuilder("Date       | Amount | Balance\n");
        for (Transaction transaction : transactions) {
            statement.append(transaction).append("\n");
        }
        return statement.toString().trim();
    }
}
