/*
 * Ares Ton-That
 * This program is designed to solve a 2 x 2 system of linear equations.
 */
import java.util.Scanner;

public class SolveLinearEquations {

	public static void main(String[] args) {
		
		//Create a new scanner.
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a value for a, b, c, d, e, and f.
		System.out.print("Enter a value for a, b, c, d, e, and f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		//Store values for the numerator and denominator in different variables.
		
		double denominator = a * d - b * c;
		double numeratorOne = e * d - b * f;
		double numeratorTwo = a * f - e * c;
		
		/*
		 * Create conditions that solve the system of equations as long as
		 * the denominator is not equal to zero.
		 */
		if (denominator != 0) {
			double x = numeratorOne / denominator;
			double y = numeratorTwo / denominator;
			System.out.println("The x value is " + x);
			System.out.println("The y value is " + y);
		}
		else {
			System.out.println("Denominator cannot be zero");
		}
		
		input.close();
	}

}