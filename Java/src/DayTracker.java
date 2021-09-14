/*
 * Ares Ton-That
 * This program is designed to predict the day of the week for any future day.
 */

import java.util.Scanner;

public class DayTracker {

	public static void main(String[] args) {
		
		//Create a new scanner.
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to enter an integer representing the day of the week.
		System.out.print("Enter today's day: ");
		int today = input.nextInt();
		
		//Prompt the user to enter a number of days after today.
		System.out.print("Enter a number of days after today: ");
		int futureDay = input.nextInt();
		
		//Store today and futureDay in one variable.
		int newDay = futureDay += today;
		
		/*
		 * Create conditions that read the user's input and calculates today's
		 * day of the week.
		 */
	
		if (today == 0) {
			System.out.print("Today is Sunday and ");
		}
		else if (today == 1) {
			System.out.print("Today is Monday and ");
		}
		else if (today == 2) {
			System.out.print("Today is Tuesday and ");
		}
		else if (today == 3) {
			System.out.print("Today is Wednesday and ");
		}
		else if (today == 4) {
			System.out.print("Today is Thursday and ");
		}
		else if (today == 5) {
			System.out.print("Today is Friday and ");
		}
		else if (today == 6) {
			System.out.print("Today is Saturday and ");
		}
		
		//Create conditions to display the day of the week of the day the user inputs.
		if (newDay % 7 == 0) {
			System.out.print("the future day is Sunday");
		}
		else if (newDay % 7 == 1) {
			System.out.print("the future day is Monday");
		}
		else if (newDay % 7 == 2) {
			System.out.print("the future day is Tuesday");
		}
		else if (newDay % 7 == 3) {
			System.out.print("the future day is Wednesday");
		}
		else if (newDay % 7 == 4) {
			System.out.print("the future day is Thursday");
		}
		else if (newDay % 7 == 5) {
			System.out.print("the future day is Friday");
		}
		else if (newDay % 7 == 6) {
			System.out.print("the future day is Saturday");
		}
		
		
		input.close();
	}

}