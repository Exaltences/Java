/*
 * Ares Ton-That
 * This program is designed to split a string into all of its substrings.
 */

import java.util.Scanner;

public class SplitStringsIntoSubstrings {

	public static void main(String[] args) {

		// Create a new scanner.
		Scanner input = new Scanner(System.in);

		// Get user input.
		System.out.print("Enter a word: ");
		String word = input.next();

		String listOfSubstrings = substrings(word);
		displaySubstrings(listOfSubstrings);
		System.out.println(word);
	}

	// Create a method to return all substrings of the word.
	public static String substrings(String userInput) {

		String substrings = "";
		String output = "";

		for (int i = 0; i <= userInput.length() - 1; i++) {

			for (int j = 0; i + j <= userInput.length(); j++) {
				substrings = userInput.substring(j, j + i);
				output += substrings;
				output += "\n";
			}
		}

		return output;
	}

	public static void displaySubstrings(String substrings) {
		System.out.print(substrings);
	}

}