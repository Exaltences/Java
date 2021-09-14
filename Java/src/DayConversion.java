/*
 * Ares Ton-That
 * This program is designed to convert seconds into
 * minutes, hours, and days.
 */

import java.util.Scanner;

public class DayConversion {

	public static void main(String[] args) {

		//Create a new scanner.
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter a number of seconds.
		System.out.print("Enter the number of seconds: ");
		int seconds = input.nextInt();
		
		//Create conversion factors.
		final int MINUTES = seconds / 60;
		final int HOURS = seconds / 3600;
		final int DAYS = seconds / 86400;
		
		/*
		 * Create conditions that tell how many minutes, hours, or days 
		 * are in the number of seconds the user inputs.
		 */
		if (seconds >= 86400) {
			System.out.println("There are " + seconds + " seconds in " + DAYS + " days.");
		}
		else if (seconds >= 3600) {
			System.out.println("There are " + seconds + " seconds in " + HOURS + " hours.");
		}
		else if (seconds >= 60) {
			System.out.println("There are " + seconds + " seconds in " + MINUTES + " minutes.");
		}
		else {
			System.out.println("Number of seconds must be greater than 60.");
		}
		
		input.close();
		
	}

}