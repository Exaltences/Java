/*
 * Ares Ton-That
 * This program is designed to display some information about a character
 * the user inputs.
 */

import java.util.Scanner;

public class CharacterInformation {

	public static void main(String[] args) {
		
		//Create a new scanner.
		Scanner input = new Scanner(System.in);
		
		//Get user input.
		System.out.print("Enter a character: ");
		char character = input.next().charAt(0);
		
		//Describe the character.
		if (character >= 'A' && character <= 'Z') {
			System.out.println("uppercase letter");
		}
		
		else if (character >= 'a' && character <= 'z') {
			System.out.println("lowercase letter");
		}
		
		else if (character >= '0' && character <= '9') {
			System.out.println("digit");
		}
		
		else {
			System.out.println("non-alphanumeric");
		}
		
		input.close();
	}

}