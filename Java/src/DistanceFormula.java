/*
 * Ares Ton-That
 * This program is designed to compute the distance between any two points.
 */

import java.util.Scanner;

public class DistanceFormula {

	public static void main(String[] args) {
		//Create a new scanner
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter the x and y values of two points.
		System.out.print("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		//Create two variables to represent x2 - x1 and y2 - y1.
		double x3 = x2 - x1;
		double y3 = y2 - y1;
		//Create a formula to compute the distance between the two points.
		double distance = Math.sqrt(Math.pow(x3, 2.0) + Math.pow(y3, 2.0));
		//Display the result
		System.out.println("The distance between point (" + x1 +", " + y1 + ") and ("
							+ x2 + ", " + y2 +") is: " + distance);
		input.close();
		
	}

}