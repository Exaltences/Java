/*
 * Ares Ton-That
 * This program is designed to tell the user whether a number is 
 * zero, negative, or positive and small or large.
 */

import java.util.Scanner;

public class NumberDescription {

	public static void main(String[] args) {
		
		//Create a new scanner.
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a floating-point number.
		System.out.print("Enter a floating-point number: ");
		double number = input.nextDouble();
		
		/*
		 * Create conditions that tell the user whether the number is
		 * small or large.
		 */
		if (Math.abs(number) > 1000000) {
			System.out.print("large, ");
		}
		if (Math.abs(number) < 1 && number != 0) {
			System.out.print("small, ");
		}
		
		/*
		 * Create conditions that tell the user whether the number is 
		 * positive, negative or zero.
		 */
		if (number == 0) {
			System.out.println("zero");
		}
		else if (number > 0) {
			System.out.print("positive");
		}
		else {
			System.out.print("negative");
		}
		
		input.close();
	}

}