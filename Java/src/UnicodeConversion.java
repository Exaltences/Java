/*
 * Ares Ton-That
 * This program is designed to convert characters to unicode values and
 * vice-versa.
 */

import java.util.Scanner;

public class UnicodeConversion {

	public static void main(String[] args) {

		// Create a new scanner
		Scanner input = new Scanner(System.in);

		// Create the menu.
		final String menu = "a. Convert Character to Unicode\n" + "b. Convert Unicode to Character\n"
				+ "c. Exit program\n" + "Enter your choice: ";

		// Get user input.
		System.out.println(menu);
		char userChoice = input.next().charAt(0);

		// Convert the values and display the result.
		if (userChoice == 'a') {
			System.out.print("Enter a character: ");
			char character = input.next().charAt(0);
			int conversionToUnicode = (int) character;
			System.out.println("The unicode value is " + conversionToUnicode);
		}

		else if (userChoice == 'b') {
			System.out.print("Enter a unicode value: ");
			int unicodeValue = input.nextInt();

			if (unicodeValue >= 0) {
				char conversionToCharacter = (char) unicodeValue;
				System.out.println("The character is " + conversionToCharacter);
			}
			
			else {
				System.out.println("The input cannot be negative.");
				System.out.println("The program will now exit.");
				
				System.exit(1);
			}
		}

		else if (userChoice == 'c') {
			System.out.println("You have chosen to exit the program.");

			System.exit(0);
		}

		else {
			System.out.println("Invalid input.");
			System.out.println("The program will now exit.");

			System.exit(1);
		}

		input.close();
	}

}