/*
 * Ares Ton-That
 * This program is designed to separate a number's integer and decimal parts.
 */

import java.util.Scanner;

public class DecimalSeparation {

	public static void main(String[] args) {
		//Create a new scanner.
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter a floating-point value.
		System.out.print("Enter a floating-point value: ");
		double value = input.nextDouble();
		//Separate the integer and fractional parts and print the results.
		int integerPart = (int)(value) % (int)(++value);
		System.out.println("Integer part: " + integerPart);
		double fractionalPart = value % (int)(value);
		System.out.println("Fractional part: " + fractionalPart);
		input.close();

	}

}