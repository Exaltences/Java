/*
 * Ares Ton-That
 * This program is designed to convert a series of 10 letters into a phone number.
 */

import java.util.Scanner;

public class PhoneNumberConverter {

	public static void main(String[] args) {
		
		//Create a new scanner.
		Scanner input = new Scanner(System.in);
				
		//Get user input.
		System.out.print("Enter input: ");
		String userInput = input.nextLine();
		
		int number = 0;
		
		int indexValue = 0;
		
		String phoneNumber = "(";
		
		if (userInput.length() != 10) {
			System.out.println("Input must be 10 characters long.");
			System.exit(1);
		}
		
		else {
			while (indexValue <= userInput.length() - 8) {
				
				if (userInput.toUpperCase().charAt(indexValue) >= 'W') {
					number = 9;
				}
				
				else if (userInput.toUpperCase().charAt(indexValue) >= 'T') {
					number = 8;
				}
				
				else if (userInput.toUpperCase().charAt(indexValue) >= 'P') {
					number = 7;
				}
				
				else if (userInput.toUpperCase().charAt(indexValue) >= 'M') {
					number = 6;
				}
				
				else if (userInput.toUpperCase().charAt(indexValue) >= 'J') {
					number = 5;
				}
				
				else if (userInput.toUpperCase().charAt(indexValue) >= 'G') {
					number = 4;
				}
				
				else if (userInput.toUpperCase().charAt(indexValue) >= 'D') {
					number = 3;
				}
				
				else if (userInput.toUpperCase().charAt(indexValue) >= 'A') {
					number = 2;
				}
				
				phoneNumber += number;
				indexValue++;
			}
			
			phoneNumber += ") ";
			
			while (indexValue <= userInput.length() - 5) {
				
				if (userInput.toUpperCase().charAt(indexValue) >= 'W') {
					number = 9;
				}
				
				else if (userInput.toUpperCase().charAt(indexValue) >= 'T') {
					number = 8;
				}
				
				else if (userInput.toUpperCase().charAt(indexValue) >= 'P') {
					number = 7;
				}
				
				else if (userInput.toUpperCase().charAt(indexValue) >= 'M') {
					number = 6;
				}
				
				else if (userInput.toUpperCase().charAt(indexValue) >= 'J') {
					number = 5;
				}
				
				else if (userInput.toUpperCase().charAt(indexValue) >= 'G') {
					number = 4;
				}
				
				else if (userInput.toUpperCase().charAt(indexValue) >= 'D') {
					number = 3;
				}
				
				else if (userInput.toUpperCase().charAt(indexValue) >= 'A') {
					number = 2;
				}
				
				phoneNumber += number;
				indexValue++;
			}
		}
		
		phoneNumber += "-";
		
		while (indexValue <= userInput.length() - 1) {
			
			if (userInput.toUpperCase().charAt(indexValue) >= 'W') {
				number = 9;
			}
			
			else if (userInput.toUpperCase().charAt(indexValue) >= 'T') {
				number = 8;
			}
			
			else if (userInput.toUpperCase().charAt(indexValue) >= 'P') {
				number = 7;
			}
			
			else if (userInput.toUpperCase().charAt(indexValue) >= 'M') {
				number = 6;
			}
			
			else if (userInput.toUpperCase().charAt(indexValue) >= 'J') {
				number = 5;
			}
			
			else if (userInput.toUpperCase().charAt(indexValue) >= 'G') {
				number = 4;
			}
			
			else if (userInput.toUpperCase().charAt(indexValue) >= 'D') {
				number = 3;
			}
			
			else if (userInput.toUpperCase().charAt(indexValue) >= 'A') {
				number = 2;
			}
			
			phoneNumber += number;
			indexValue++;
		}
			
		System.out.println("Phone Number: " + phoneNumber);
		
		input.close();
	}

}