package com.filehandlingreadandwriteatextfile;

// Class to test file read and write operation
public class FileCopyMain {

    // Main method to execute the file copy process
    public static void main(String[] args) {

        // Define the source file path
        String sourceFile = "source.txt";

        // Define the destination file path
        String destinationFile = "destination.txt";

        // Call the method to copy the file
        FileCopy.copyTextFile(sourceFile, destinationFile);
    }
}
