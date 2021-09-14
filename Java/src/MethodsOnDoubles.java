/*
 * Ares Ton-That
 * This program is designed to implement methods that perform a variety of operations on an array of doubles
 */

import java.util.Scanner;

public class MethodsOnDoubles {

	public static void main(String[] args) {

		// Create a new array of 10 doubles.
		double[] arrayOfDoubles = new double[10];

		arrayOfDoubles = createArray();

		// Print the original array and the arrays created from each method.
		printArray(arrayOfDoubles);

		squarerootDoubleArray(arrayOfDoubles);

		replaceNumbersInArray(arrayOfDoubles);

		printArray(arrayOfDoubles);

		printArray(doubleArrayReciprocal(arrayOfDoubles));

		printArray(arrayOfDoubles);
	}

	public static double[] createArray() {

		// Create a new scanner.
		Scanner in = new Scanner(System.in);

		// Create an array reference variable.
		double[] arrayOfDoubles = new double[10];

		// Populate the array with user input.

		for (int i = 0; i < arrayOfDoubles.length; i++) {

			System.out.println("Please input a number: ");

			while (!in.hasNextDouble()) {

				in.nextLine();
				System.out.println("Sorry, that input does not work. Please try again. Thank you!");
			}

			arrayOfDoubles[i] = in.nextDouble();

		}

		return arrayOfDoubles;
	}

	public static void squarerootDoubleArray(double[] newArray) {

		for (int i = 0; i < newArray.length; i++) {

			System.out.print(Math.sqrt(newArray[i]) + " ");
		}
		
		System.out.println();
	}

	public static void replaceNumbersInArray(double[] newArray) {

		for (int i = 0; i < newArray.length; i++) {

			if (newArray[i] > 500) {

				newArray[i] = 500;
			}
		}
	}

	public static double[] doubleArrayReciprocal(double[] newArray) {

		double[] doubleArrayReciprocal = new double[newArray.length];

		for (int i = 0; i < doubleArrayReciprocal.length; i++) {

			doubleArrayReciprocal[i] = newArray[i];

		}

		for (int i = 0; i < doubleArrayReciprocal.length; i++) {

			doubleArrayReciprocal[i] = 1 / doubleArrayReciprocal[i];
		}

		return doubleArrayReciprocal;
	}

	public static void printArray(double[] newArray) {

		for (int i = 0; i < newArray.length; i++) {

			System.out.print(newArray[i] + " ");
		}

		System.out.println();
	}

}