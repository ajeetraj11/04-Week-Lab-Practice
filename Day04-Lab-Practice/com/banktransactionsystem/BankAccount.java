package com.banktransactionsystem;

// BankAccount class to manage account operations
class BankAccount {
     // Private instance variable to store account balance
     private double balance;

     // Constructor to initialize the account balance
     public BankAccount(double initialBalance) {
          this.balance = initialBalance;
     }

     // Method to withdraw an amount from the account
     public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
          // Checking if the withdrawal amount is negative
          if (amount < 0) {
               // Throwing IllegalArgumentException for invalid negative input
               throw new IllegalArgumentException("Invalid amount!");
          }

          // Checking if the withdrawal amount is greater than the available balance
          if (amount > balance) {
               // Throwing custom exception for insufficient balance
               throw new InsufficientBalanceException("Insufficient balance!");
          }

          // Deducting the amount from balance
          balance -= amount;

          // Printing successful withdrawal message with new balance
          System.out.println("Withdrawal successful, new balance: " + balance);
     }
}
