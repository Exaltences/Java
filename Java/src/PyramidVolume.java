/*
 * Ares Ton-That
 * This program is designed to compute the volume of a pyramid with any given
 * length, width, and height.
 */

import java.util.Scanner;

public class PyramidVolume {

	public static void main(String[] args) {
		//Create a new scanner.
		Scanner input = new Scanner(System.in);
		//Prompt the user to enter the length, width, and height of a pyramid.
		System.out.print("Enter the length, width, and height of a pyramid: ");
		double length = input.nextDouble();
		double width = input.nextDouble();
		double height = input.nextDouble();
		/*
		 * Create formulas to compute the area of the base and
		 * the volume of the pyramid.
		 */
		double area = length * width; 
		double volume = (1.0/3.0) * area * height;
		//Display the result
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
		input.close();
		
	}

}