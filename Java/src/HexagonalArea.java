/*
 * Ares Ton-That
 * This program computes the area of a hexagon.
 */

import java.util.Scanner;

public class HexagonalArea {

	public static void main(String[] args) {
		
		//Create a new scanner.
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a side length.
		System.out.print("Enter the length of a side of the hexagon: ");
		double side = input.nextDouble();
		
		//Create the formula to compute the area.
		double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
		double areaRounded = Math.round(area * 1000) / 1000.0;
		
		//Display the result.
		if (side >= 0) {
			System.out.println("Area is " + areaRounded);
		}
		
		else {
			System.out.println("The length of the side cannot be negative.");
			System.out.println("The program will now exit.");
			
			System.exit(1);
		}
		
		input.close();
	}

}