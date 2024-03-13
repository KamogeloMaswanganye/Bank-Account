/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankaccount;

/**
 *
 * @author 111ma
 */
public class BankAccount {
    // Attributes
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into account " + accountNumber);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient balance to withdraw $" + amount + " from account " + accountNumber);
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Example usage
        BankAccount account = new BankAccount("123456789", 1000.0);
        account.displayAccountDetails();
        account.deposit(500.0);
        account.displayAccountDetails();
        account.withdraw(200.0);
        account.displayAccountDetails();
    }
}

