
/*
 * Ares Ton-That
 * This program is designed to validate a user's password.
 */

import java.util.Scanner;

public class PasswordValidator {

	public static void main(String[] args) {

		// Create a new scanner.
		Scanner input = new Scanner(System.in);

		// Get user input.
		System.out.print("Enter the password: ");
		String password = input.next();
		
		//Create boolean variables to store the method values.
		boolean containsThirteenCharacters = hasThirteenCharacters(password);
		boolean containsFourDigits = hasFourDigits(password);
		boolean containsSevenLetters = hasSevenLetters(password);
		boolean containsThreeUppercaseLetters = hasThreeUppercaseLetters(password);
		boolean containsTwoNonAlphanumericCharacters = hasTwoNonAlphanumericCharacters(password);

		if (containsThirteenCharacters == false) {
			System.out.println("The password has less than 13 characters.");
		}

		if (containsFourDigits == false) {
			System.out.println("The password does not have four or more digits.");
		}

		if (containsSevenLetters == false) {
			System.out.println("The password does not have seven or more letters");
		}

		if (containsThreeUppercaseLetters == false) {
			System.out.println("The password does not have three or more uppercase letters");
		}

		if (containsTwoNonAlphanumericCharacters == false) {
			System.out.println("The password does not have two or more non-alphanumeric characters");
		}

		if (containsThirteenCharacters == true && containsFourDigits == true && containsSevenLetters == true
				&& containsThreeUppercaseLetters == true && containsTwoNonAlphanumericCharacters == true) {
			System.out.println("The password is valid.");
		}
	}
	
	//Create boolean methods to validate the password.
	public static boolean hasThirteenCharacters(String password) {
		if (password.length() >= 13) {
			return true;
		}

		else {
			return false;
		}
	}

	public static boolean hasFourDigits(String password) {
		String digits = "";

		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
				digits += password.charAt(i);
			}
		}

		if (digits.length() >= 4) {
			return true;
		}

		else {
			return false;
		}
	}

	public static boolean hasSevenLetters(String password) {

		String letters = "";

		for (int i = 0; i < password.length(); i++) {
			if (password.toUpperCase().charAt(i) >= 'A' && password.toUpperCase().charAt(i) <= 'Z') {
				letters += password.charAt(i);
			}
		}

		if (letters.length() >= 7) {
			return true;
		}

		else {
			return false;
		}
	}

	public static boolean hasThreeUppercaseLetters(String password) {

		String uppercaseLetters = "";

		for (int i = 0; i < password.length(); i++) {

			if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
				uppercaseLetters += password.charAt(i);
			}
		}

		if (uppercaseLetters.length() >= 3) {
			return true;
		}

		else {
			return false;
		}
	}

	public static boolean hasTwoNonAlphanumericCharacters(String password) {

		String nonAlphanumericCharacters = "";

		for (int i = 0; i < password.length(); i++) {

			if (password.charAt(i) < '0' || (password.charAt(i) > '9' && password.charAt(i) < 'A')
					|| (password.charAt(i) > 'Z' && password.charAt(i) < 'a') || password.charAt(i) > 'z') {
				nonAlphanumericCharacters += password.charAt(i);
			}
		}

		if (nonAlphanumericCharacters.length() >= 2) {
			return true;
		}

		else {
			return false;
		}
	}

}