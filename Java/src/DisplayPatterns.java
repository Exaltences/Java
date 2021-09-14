/*
 * Ares Ton-That
 * This program is designed to display a pattern based on user input.
 */

import java.util.Scanner;

public class DisplayPatterns {

	public static void main(String[] args) {

		// Create a new scanner.
		Scanner input = new Scanner(System.in);

		// Get user input.
		System.out.print("Enter the size of the grid: ");
		int size = input.nextInt();

		while (size < 0) {
			System.out.println("Input cannot be negative. Please try again.");
			System.out.print("Enter the size of the grid: ");
			size = input.nextInt();
		}

		String firstPattern = patternOne(size);

		String secondPattern = patternTwo(size);

		displayPattern(firstPattern, secondPattern, size);

		input.close();
	}

	// Use methods to create the patterns and store them.
	public static String patternOne(int size) {

		String patternBuilder = "";

		for (int i = 0; i < size; i++) {
			patternBuilder += "--+";
		}

		String pattern = patternBuilder;

		return pattern;
	}

	public static String patternTwo(int size) {

		String patternBuilder = "";

		for (int i = 0; i < size; i++) {
			patternBuilder += "|  ";
		}

		String pattern = patternBuilder;

		return pattern;
	}

	public static void displayPattern(String pattern1, String pattern2, int size) {

		for (int i = 0; i < (2 * size + 1); i++) {

			if (i % 2 == 0) {
				System.out.println("+" + pattern1);
			}

			else {
				System.out.println("|  " + pattern2);
			}
		}
	}
}