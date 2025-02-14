package com.exceptionpropagationinmethods;

class ExceptionPropagationExample {
    public static void main(String[] args) {
        // Calling the method which will eventually throw an exception
        try {
            method1();
        }
        catch (ArithmeticException e) {
            // Handling propagated exception in main method
            System.out.println("Exception handled in main: " + e.getMessage());
        }
    }

    // Method1 calls method2 and does not handle exceptions
    public static void method1() {
        method2();
    }

    // Method2 calls method3 and does not handle exceptions
    public static void method2() {
        method3();
    }

    // Method3 throws an exception
    public static void method3() {
        throw new ArithmeticException("Exception thrown in method3");
    }
}
