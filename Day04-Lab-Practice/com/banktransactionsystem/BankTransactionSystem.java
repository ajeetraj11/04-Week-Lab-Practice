package com.banktransactionsystem;

// Main class to test the Bank Account System
class BankTransactionSystem {
     public static void main(String[] args) {
          // Creating a BankAccount object with an initial balance of 5000
          BankAccount account = new BankAccount(5000);

          try {
               // Attempting a valid withdrawal
               account.withdraw(2000);

               // Attempting withdrawal with insufficient balance
               account.withdraw(4000);
          }
          catch (InsufficientBalanceException e) {
               // Handling the custom exception for insufficient balance
               System.out.println(e.getMessage());
          }
          catch (IllegalArgumentException e) {
               // Handling the exception for negative amount
               System.out.println(e.getMessage());
          }

          try {
               // Attempting withdrawal with a negative amount
               account.withdraw(-500);
          }
          catch (InsufficientBalanceException e) {
               // Handling the custom exception for insufficient balance
               System.out.println(e.getMessage());
          }
          catch (IllegalArgumentException e) {
               // Handling the exception for negative amount
               System.out.println(e.getMessage());
          }
     }
}
