/*
 * Ares Ton-That
 * This program is designed to implement methods that perform a variety of operations on an array of doubles
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdditionalMethodsOnDoubles {

	public static void main(String[] args) {

		// Create a new list of doubles.
		List<Double> listOfDoubles = new ArrayList<Double>();
		listOfDoubles = createList();

		// Print the original list and the lists created from each method.
		printList(listOfDoubles);

		squarerootDoubleArray(listOfDoubles);

		replaceNumbersInArray(listOfDoubles);

		printList(listOfDoubles);

		printList(doubleArrayReciprocal(listOfDoubles));

		printList(listOfDoubles);
	}

	public static List<Double> createList() {

		// Create a new scanner.
		Scanner in = new Scanner(System.in);

		// Create an arraylist reference variable.
		List<Double> listOfDoubles = new ArrayList<Double>();
		
		//Ask the user for the number of doubles that should be in the list.
		System.out.print("How many doubles do you want in this list? ");
		int numberOfDoubles = in.nextInt();

		// Populate the array with user input.
		for (int i = 0; i < numberOfDoubles; i++) {

			System.out.println("Please input a number: ");

			while (!in.hasNextDouble()) {

				in.nextLine();
				System.out.println("Sorry, that input does not work. Please try again. Thank you!");
			}

			listOfDoubles.add(in.nextDouble());

		}

		return listOfDoubles;
	}

	public static void squarerootDoubleArray(List<Double> doubleList) {

		for (int i = 0; i < doubleList.size(); i++) {

			System.out.print(Math.sqrt(doubleList.get(i)) + " ");
		}
		
		System.out.println();
	}

	public static void replaceNumbersInArray(List<Double> doubleList) {

		for (int i = 0; i < doubleList.size(); i++) {

			if (doubleList.get(i) > 500) {

				doubleList.set(i, new Double(500));
			}
		}
	}

	public static List<Double> doubleArrayReciprocal(List<Double> doubleList) {

		List<Double> reciprocalList = new ArrayList<Double>();

		for (int i = 0; i < doubleList.size(); i++) {

			reciprocalList.add(1 / doubleList.get(i));

		}
		
		return reciprocalList;
	}

	public static void printList(List<Double> doubleList) {

		for (int i = 0; i < doubleList.size(); i++) {

			System.out.print(doubleList.get(i) + " ");
		}

		System.out.println();
	}

}