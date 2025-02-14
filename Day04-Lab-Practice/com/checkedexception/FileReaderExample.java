package com.checkedexception;

import java.io.*;

class FileReaderExample {

    public static void main(String[] args) {
        // Calling the method to read the file
        readFile("data.txt");
    }

    // Method to read a file and handle IOException
    public static void readFile(String fileName) {
        // Creating a File object for the given file name
        File file = new File(fileName);

        // Using try-catch to handle IOException
        try {
            // Creating FileReader and BufferedReader to read the file
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Reading and printing file contents line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Closing the BufferedReader
            bufferedReader.close();
        }
        catch (IOException e) {
            // Catching IOException and displaying an error message
            System.out.println("File not found");
        }
    }
}
