package com.multiplecatchblocks;

// Class to perform array operations
class ArrayOperations {

    // Method to retrieve and print the value at a given index
    public static void retrieveElement(int[] array, int index) {
        try {
            // Checking if the array is null before accessing elements
            if (array == null) {
                // Throwing a NullPointerException if the array is not initialized
                throw new NullPointerException("Array is not initialized!");
            }

            // Retrieving the value at the given index
            int value = array[index];

            // Printing the retrieved value
            System.out.println("Value at index " + index + ": " + value);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            // Handling exception when index is out of bounds
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e) {
            // Handling exception when array is null
            System.out.println(e.getMessage());
        }
    }
}

