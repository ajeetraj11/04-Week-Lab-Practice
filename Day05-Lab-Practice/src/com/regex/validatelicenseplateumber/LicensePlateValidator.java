package com.regex.validatelicenseplateumber;

import java.util.regex.Pattern;

// Class responsible for license plate validation
public class LicensePlateValidator {
	// Method to validate if the given license plate meets the required conditions
	public static boolean isValidLicensePlate(String plateNumber) {
		// Regular expression pattern
		String regex = "^[A-Z]{2}[0-9]{4}$";

		// Compiling the regex pattern and matching it with the input plate number
		return Pattern.matches(regex, plateNumber);
	}

	public static void main(String[] args) {
		// Defining test license plates
		String[] testPlates = {"AB1234", "A12345", "XY5678", "Z91234", "ab1234", "CD12"};

		// Iterating through test plates and validating each one
		for (String plate : testPlates) {
			// Checking if the license plate is valid and printing the result
			if (isValidLicensePlate(plate)) {
				System.out.println(plate + " -> Valid");
			}
			else {
				System.out.println(plate + " -> Invalid");
			}
		}
	}
}
