/*
 * Ares Ton-That
 * This program is designed to read a string then take different characters of
 * the string and display them based on the user's increment value.
 */
import java.util.Scanner;

public class DisplaySubstrings {

	public static void main(String[] args) {
		
		//Create a new scanner.
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter an interval value.
		System.out.println("Enter an interval value: ");
		int value = input.nextInt();
		input.nextLine();
		
		//Prompt the user to enter a string.
		System.out.println("Enter a string: ");
		String userString = input.nextLine();
		char firstCharacter = userString.charAt(0);
		char nextCharacter = ' ';
		String resultString = "";
		String sum = "";
		
			while (value > 0 && value <= userString.length() - 1) {
				nextCharacter = userString.charAt(value);
				sum += nextCharacter;
				resultString = "" + firstCharacter + sum;
				value = value + value;
			}
		
		System.out.println(resultString);
		
		input.close();
	}

}