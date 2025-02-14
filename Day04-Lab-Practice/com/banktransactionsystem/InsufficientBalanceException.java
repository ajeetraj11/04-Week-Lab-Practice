package com.banktransactionsystem;

// Custom Exception Class for Insufficient Balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        // Calling the parent Exception class constructor with the message
        super(message);
    }
}

