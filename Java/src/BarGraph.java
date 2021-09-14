/*
 * Ares Ton-That
 * This program is designed to create a bar graph based on the total sales
 * I made.
 */

import java.util.Scanner;

public class BarGraph {

	public static void main(String[] args) {

		// Create a new scanner
		Scanner input = new Scanner(System.in);

		// Get user input
		System.out.print("How many stores are there?: ");
		int numberOfStores = input.nextInt();

		int totalSales[] = new int[numberOfStores];

		for (int i = 0; i < numberOfStores; i++) {
			System.out.print("Enter the total sales for Store " + (i + 1) + ": ");
			totalSales[i] = input.nextInt();

			if (totalSales[i] % 100 != 0) {
				System.out.println("Sales must be divisible by 100");
				System.out.println("Program will now exit");
				System.exit(1);
			}

		}

		System.out.println("GRAPH OF TOTAL SALES");
		System.out.println("(Each * = $100)");
		
		for (int i = 0; i < numberOfStores; i++) {
			System.out.println("Store " + (i + 1) + ": ");
			
				for (int j = 0; j < totalSales[i] / 100; j++) {
					System.out.print("*");
				}
				
				System.out.println();
		}
		
		input.close();
	}

}