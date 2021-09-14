/*
 * Ares Ton-That
 * This program is designed to gather the roots of a quadratic equation
 * using the quadratic formula
 */

import java.util.Scanner;

public class QuadraticFormula {

	public static void main(String[] args) {
		
		//Create a new scanner.
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter values for a, b, and c.
		System.out.print("Enter the values for a, b, and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		//Create a formula to evaluate the discriminant.
		double discriminant	= Math.pow(b, 2) - (4 * a * c);
		
		//Create formulas to find both roots
		double firstRoot = (-b + Math.sqrt(discriminant))/(2 * a);
		double secondRoot = (-b - Math.sqrt(discriminant))/(2 * a);
				
		/*
		 * Create conditions that will find the roots of a quadratic equation
		 * upon evaluating the discriminant and determining the number of roots
		 * the equation will have.
		 */
		if (discriminant > 0) {
			System.out.println("The equation has two roots " + firstRoot + "and " + secondRoot);
		}
		else if (discriminant == 0) {
			System.out.println("The equation has one root " + firstRoot);
		}
		else {
			System.out.println("The equation has no real roots.");
		}
		
		input.close();
	}

}