/*
 * Ares Ton-That
 * This program is designed to read a string and display various information about it
 * including the number of vowels and consonants, the position of vowels,
 * and the vowels replaced.
 */

import java.util.Scanner;

public class StringDescriptor {

	public static void main(String[] args) {

		// Create a new scanner.
		Scanner input = new Scanner(System.in);

		// Get user input
		System.out.print("Enter a string: ");
		String userString = input.nextLine();

		// Initialize strings and integers to use for the output.
		String uppercaseLetters = "";
		String vowelsAsUnderscores = "";
		int numberOfVowels = 0;
		int numberOfConsonants = 0;
		String positionsOfVowels = "";

		// Create a loop and use if statements to display the output.
		for (int i = 0; i < userString.length(); i++) {

			if (userString.charAt(i) >= 'A' && userString.charAt(i) <= 'Z') {
				uppercaseLetters += userString.charAt(i);
				uppercaseLetters += " ";
			}

			if (userString.toUpperCase().charAt(i) == 'A' || userString.toUpperCase().charAt(i) == 'E'
					|| userString.toUpperCase().charAt(i) == 'I' || userString.toUpperCase().charAt(i) == 'O'
					|| userString.toUpperCase().charAt(i) == 'U') {
				vowelsAsUnderscores += "_";
			}

			else {
				vowelsAsUnderscores += userString.charAt(i);
			}

			if (userString.toUpperCase().charAt(i) == 'A' || userString.toUpperCase().charAt(i) == 'E'
					|| userString.toUpperCase().charAt(i) == 'I' || userString.toUpperCase().charAt(i) == 'O'
					|| userString.toUpperCase().charAt(i) == 'U') {
				numberOfVowels++;
			}

			if (userString.toUpperCase().charAt(i) == 'B' || userString.toUpperCase().charAt(i) == 'C'
					|| userString.toUpperCase().charAt(i) == 'D' || userString.toUpperCase().charAt(i) == 'F'
					|| userString.toUpperCase().charAt(i) == 'G' || userString.toUpperCase().charAt(i) == 'H'
					|| userString.toUpperCase().charAt(i) == 'J' || userString.toUpperCase().charAt(i) == 'K'
					|| userString.toUpperCase().charAt(i) == 'L' || userString.toUpperCase().charAt(i) == 'M'
					|| userString.toUpperCase().charAt(i) == 'N' || userString.toUpperCase().charAt(i) == 'P'
					|| userString.toUpperCase().charAt(i) == 'Q' || userString.toUpperCase().charAt(i) == 'R'
					|| userString.toUpperCase().charAt(i) == 'S' || userString.toUpperCase().charAt(i) == 'T'
					|| userString.toUpperCase().charAt(i) == 'V' || userString.toUpperCase().charAt(i) == 'W'
					|| userString.toUpperCase().charAt(i) == 'X' || userString.toUpperCase().charAt(i) == 'Y'
					|| userString.toUpperCase().charAt(i) == 'Z') {
				numberOfConsonants++;
			}

			if (userString.toUpperCase().charAt(i) == 'A' || userString.toUpperCase().charAt(i) == 'E'
					|| userString.toUpperCase().charAt(i) == 'I' || userString.toUpperCase().charAt(i) == 'O'
					|| userString.toUpperCase().charAt(i) == 'U') {

				positionsOfVowels += i;
				positionsOfVowels += " ";
			}
		}

		System.out.println("Uppercase letters:      " + uppercaseLetters);
		System.out.println("Vowels replaced:        " + vowelsAsUnderscores);
		System.out.println("Number of vowels:       " + numberOfVowels);
		System.out.println("Number of consonants:   " + numberOfConsonants);
		System.out.println("Positions of vowels:    " + positionsOfVowels);

		input.close();
	}

}