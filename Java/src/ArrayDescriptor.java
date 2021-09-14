/*
 * Ares Ton-That
 * This program is designed to create an array and display it as well as display
 * other info like even indexes.
 */

import java.util.Scanner;

public class ArrayDescriptor {

	public static void main(String[] args) {

		// Create a new scanner.
		Scanner in = new Scanner(System.in);

		// Get user input
		System.out.print("Enter the number of elements: ");
		int size = in.nextInt();

		int[] randomArray = new int[size];
		randomArray = randomArray(size);

		printArray(randomArray);

		System.out.println();

		printArrayEvenIndexes(randomArray);

		System.out.println();

		printOddElements(randomArray);

		System.out.println();

		printReverseArray(randomArray);

		System.out.println();

		printFirstMiddleLast(randomArray);
	}

	public static int[] randomArray(int size) {

		int[] randomArray = new int[size];

		for (int i = 0; i < randomArray.length; i++) {

			randomArray[i] = (int) (Math.random() * 20) + 1;

		}

		return randomArray;
	}

	public static void printArray(int[] randomArray) {

		System.out.print("Array:                    ");

		for (int i = 0; i < randomArray.length; i++) {
			System.out.print(randomArray[i] + " ");

		}

	}

	public static void printArrayEvenIndexes(int[] randomArray) {

		System.out.print("Even indexes:             ");

		for (int i = 0; i < randomArray.length; i += 2) {
			System.out.print(randomArray[i] + " ");

		}

	}

	public static void printOddElements(int[] randomArray) {

		System.out.print("Odd elements:             ");

		for (int i = 0; i < randomArray.length; i++) {

			if (randomArray[i] % 2 == 1) {
				System.out.print(randomArray[i] + " ");
			}

		}
	}

	public static void printReverseArray(int[] randomArray) {

		System.out.print("Reverse:                  ");

		for (int i = randomArray.length - 1; i >= 0; i--) {
			System.out.print(randomArray[i] + " ");
		}

	}

	public static void printFirstMiddleLast(int[] randomArray) {

		System.out.print("First, Middle, Last:      ");

		System.out.print(randomArray[0] + " ");

		if (randomArray.length % 2 == 0) {
			System.out.print(randomArray[randomArray.length / 2 - 1] + " ");
			System.out.print(randomArray[randomArray.length / 2] + " ");
		}

		else {
			System.out.print(randomArray[randomArray.length / 2] + " ");
		}
		System.out.print(randomArray[randomArray.length - 1]);
	}

}