/*
 * Ares Ton-That
 * This program is designed to find the area of a rectangle based on user input.
 */

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {

		// Create variables to store the length and width.
		double length = readLength();
		double width = readWidth();

		double area = computeArea(length, width);

		displaySolution(area);
	}

	// Create a method to read the length.
	public static double readLength() {

		// Create a new scanner.
		Scanner input = new Scanner(System.in);
		System.out.print("What is the length of the rectangle? ");
		double length = input.nextDouble();

		while (length < 0) {
			System.out.println("Input cannot be negative. Please try again.");
			System.out.print("What is the length of the rectangle? ");
			length = input.nextDouble();
		}

		return length;
	}

	// Create a method to read the width.
	public static double readWidth() {

		// Create a new scanner.
		Scanner input = new Scanner(System.in);

		System.out.print("What is the width of the rectangle? ");
		double width = input.nextDouble();

		while (width < 0) {
			System.out.println("Input cannot be negative. Please try again.");
			System.out.print("What is the width of the rectangle? ");
			width = input.nextDouble();
		}

		return width;
	}

	// Create a method to compute the area.
	public static double computeArea(double length, double width) {

		double area = length * width;

		return area;
	}

	// Create a method to display the solution.
	public static void displaySolution(double area) {

		System.out.println("The area of the rectangle is " + area);
	}

}