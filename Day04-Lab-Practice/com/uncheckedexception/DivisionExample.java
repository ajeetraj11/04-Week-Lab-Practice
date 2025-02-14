package com.uncheckedexception;

import java.util.*;

class DivisionExample {

    public static void main(String[] args) {
        // Calling the method to perform division
        performDivision();
    }

    // Method to perform division and handle exceptions
    public static void performDivision() {
        // Creating a Scanner object for user input

         // Using try-catch to handle exceptions
         try (Scanner sc = new Scanner(System.in)) {

              // Asking the user for two numbers
              System.out.println("Enter numerator:");
              int numerator = sc.nextInt();

              System.out.println("Enter denominator:");
              int denominator = sc.nextInt();

              // Performing division
              int result = numerator / denominator;

              // Printing the result
              System.out.println("Result: " + result);
         }
         catch (ArithmeticException e) {
              // Handling division by zero
              System.out.println("Cannot divide by zero!");
         }
         catch (InputMismatchException e) {
              // Handling non-numeric input
              System.out.println("Invalid input! Please enter numbers only.");
         }
    }
}
