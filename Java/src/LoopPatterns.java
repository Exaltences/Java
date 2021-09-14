/*
 * Ares Ton-That
 * This program is designed to display patterns using for loops.
 */

import java.util.Scanner;

public class LoopPatterns {

	public static void main(String[] args) {
		
		//Create a new scanner.
		Scanner input = new Scanner(System.in);
		
		//Get user input.
		System.out.print("How many rows for Pattern 1?: ");
		int rows1 = input.nextInt();
		
		//Display the pattern if user input is valid.
		if (rows1 < 1 || rows1 > 999) {
			System.out.println("Invalid input.");
			System.out.println("The program will now exit.");
			System.exit(1);
		}
		
		else {
			for (int i = rows1; i >= 1; i--) {
				
				for (int j = rows1; j >= i; j--) {
					System.out.print(j + "  ");
				}
				
				System.out.println();
			}
		}
		
		//Get user input.
		System.out.print("How many rows for Pattern 2?: ");
		int rows2 = input.nextInt();
		String alphabet = "AbCdEfGhIjKlMnOpQrStUvWxYz";
		String reverse = "";

		//Display the pattern if user input is valid.
		
		if (rows2 < 1 || rows2 > 26) {
			System.out.println("Invalid input.");
			System.out.println("The program will now exit.");
			System.exit(1);
		}
		
		else {
			
			for (int i = 25; i >= 0; i--) {
				reverse += alphabet.charAt(i);
			}
			
			for (int i = 0; i <= rows2; i++) {
				
				for (int j = rows2 - 1; j >= i; j--) {
					
					System.out.print(reverse.charAt(j) + " ");
				}
				
				System.out.println();
			}
		}
		
		input.close();
	}

}