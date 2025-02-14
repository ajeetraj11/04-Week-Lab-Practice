package com.readuserinputfromconsole;

// Class to execute the user input and file writing process
public class UserInputMain {

    // Main method to run the program
    public static void main(String[] args) {

        // Define the file path where user input will be saved
        String filePath = "user_data.txt";

        // Call the method to read user input and save it to the file
        UserInputToFile.saveUserInput(filePath);
    }
}
