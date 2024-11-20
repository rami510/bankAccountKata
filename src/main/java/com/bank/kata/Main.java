package com.bank.kata;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        // Dépôts et retraits
        account.deposit(300);
        account.withdraw(100);

        // Impression du relevé
        System.out.println("Account Statement:");
        account.printStatement();
    }
}
