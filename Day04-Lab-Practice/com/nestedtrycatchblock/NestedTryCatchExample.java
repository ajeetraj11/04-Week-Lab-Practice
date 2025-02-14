package com.nestedtrycatchblock;

class NestedTryCatchExample {
    public static void main(String[] args) {
        // Calling the method to perform operations with nested try-catch
        performOperations();
    }

    // Method demonstrating nested try-catch handling
    public static void performOperations() {
        try {
            // Outer try block handling file operations
            try {
                int result = 10 / 0; // Causes ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception caught: " + e.getMessage());
            }

            // Inner try block handling array index issue
            try {
                int[] arr = {1, 2, 3};
                System.out.println(arr[5]); // Causes ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index exception caught: " + e.getMessage());
            }
        }
        catch (Exception e) {
            // Catching any unexpected exception
            System.out.println("General exception caught: " + e.getMessage());
        }
    }
}
