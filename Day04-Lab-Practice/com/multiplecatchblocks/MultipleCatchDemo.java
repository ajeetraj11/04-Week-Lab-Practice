package com.multiplecatchblocks;

// Main class to test the array operations
class MultipleCatchDemo {
     public static void main(String[] args) {
          // Initializing an integer array with values
          int[] numbers = {10, 20, 30, 40, 50};

          // Calling retrieveElement with a valid index
          ArrayOperations.retrieveElement(numbers, 2);

          // Calling retrieveElement with an out-of-bounds index
          ArrayOperations.retrieveElement(numbers, 10);

          // Calling retrieveElement with a null array
          ArrayOperations.retrieveElement(null, 0);
     }
}
