/*
 * Ares Ton-That
 * This program is designed to convert US dollars into pounds, euros, and yen.
 */

import java.util.Scanner;

public class DollarConversion {

	public static void main(String[] args) {
		//Create a new scanner.
		Scanner input = new Scanner(System.in);
		//Create conversion factors.
		final double POUNDS_PER_DOLLAR = 0.76;
		final double EUROS_PER_DOLLAR = 0.89;
		final double YEN_PER_DOLLAR = 101.88;
		//Prompt the user to enter a dollar amount.
		System.out.print("Enter a dollar amount: ");
		double dollars = input.nextDouble();
		double dollarsInPounds = dollars * POUNDS_PER_DOLLAR;
		double dollarsInEuros = dollars * EUROS_PER_DOLLAR;
		double dollarsInYen = dollars * YEN_PER_DOLLAR;
		//Print the number of dollars in pounds, euros, and yen.
		System.out.println("Pounds: " + dollarsInPounds);
		System.out.println("Euros: " + dollarsInEuros);
		System.out.println("Yen: " + dollarsInYen);
		input.close();
		
	}

}