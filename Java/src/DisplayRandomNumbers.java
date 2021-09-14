/*
 * Ares Ton-That
 * This program is designed to display an array of random numbers between 1 and 4
 * and separate reading numbers into blocks surrounded by parentheses.
 */

import java.util.Scanner;

public class DisplayRandomNumbers {

	public static void main(String[] args) {

		// Create a new scanner.
		Scanner in = new Scanner(System.in);

		// Get user input.
		System.out.print("How many random values? ");
		int size = in.nextInt();

		int[] randomArray = new int[size];
		randomArray = createRandomArray(size);

		printArrayWithParentheses(randomArray);
	}

	public static int[] createRandomArray(int size) {

		int[] randomArray = new int[size];

		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int) (Math.random() * 4) + 1;
		}

		return randomArray;
	}

	public static void printArrayWithParentheses(int[] randomArray) {

		for (int i = 1; i < randomArray.length - 1; i++) {

			if (randomArray[i - 1] != randomArray[i] && randomArray[i] == randomArray[i + 1]) {
				System.out.print("(" + randomArray[i] + " ");
			}

			else if (randomArray[i - 1] == randomArray[i] && randomArray[i] != randomArray[i + 1]) {
				System.out.print(randomArray[i] + ")" + " ");
			}

			else {
				System.out.print(randomArray[i] + " ");
			}
		}
	}

}