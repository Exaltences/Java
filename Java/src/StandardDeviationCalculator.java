/*
 * Ares Ton-That
 * This program is designed to compute the mean and 
 * standard deviation of various values.
 */

import java.util.Scanner;

public class StandardDeviationCalculator {

	public static void main(String[] args) {
		
		//Create a new scanner.
		Scanner input = new Scanner(System.in);
		
		//Create variables to store sum and number of terms.
		double sum = 0;
		double sumSquared = 0;
		double standardDeviation = 0;
		int termCount = 0;
		double number = 0;
		double mean = 0;
		
		//Get user input.
		System.out.println("Enter positive numbers (-1 to end input): ");
		number = input.nextDouble();
		
		while (number != -1) {
						
			sum += number;
			sumSquared += Math.pow(number, 2);
			termCount++;
			
			System.out.println("Enter positive numbers (-1 to end input): ");
			number = input.nextDouble();
			
			
		}
		
		mean = sum / termCount;
		standardDeviation = Math.sqrt(((sumSquared - Math.pow(sum, 2) / termCount) / (termCount - 1)));
		
		System.out.println("Mean: " + mean);
		System.out.println("Deviation: " + standardDeviation);
		
		input.close();
	}

}