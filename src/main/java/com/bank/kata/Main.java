package com.bank.kata;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        // deposit and withdraw
        account.deposit(300);
        account.withdraw(100);

        // Print statement
        System.out.println("Account Statement:"+account.getStatement());
    }
}
