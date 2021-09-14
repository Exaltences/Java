/*
 * Ares Ton-That
 * This program is designed to display a matrix of 0s and 1s based on user input.
 */

import java.util.Scanner;

public class MatrixGenerator {

	public static void main(String[] args) {

		// Create a new scanner.
		Scanner input = new Scanner(System.in);

		// Get user input.
		System.out.print("Enter a value for n: ");
		int n = input.nextInt();

		while (n < 0) {
			System.out.println("Value cannot be negative. Please try again.");
			System.out.print("Enter a value for n: ");
			n = input.nextInt();
		}

		printMatrix(n);

		input.close();
	}

	// Create a new method to display the matrix.
	public static void printMatrix(int n) {
		int randomMatrixNumber = 0;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				randomMatrixNumber = (int) (Math.floor(Math.random() * 2));
				System.out.print(randomMatrixNumber + " ");
			}

			System.out.println();
		}
	}

}