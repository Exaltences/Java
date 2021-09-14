/*
 * Ares Ton-That
 * This program is designed to generate a number between 1 and 12 and 
 * display the name of the month corresponding to that number.
 */

public class MonthGenerator {

	public static void main(String[] args) {
		
		//Generate a random number between 1 and 12.
		int randomNumber = 1 + (int)(Math.random() * ((12 - 1) + 1));
			if (randomNumber == 1) {
				System.out.println("January");
			}
			else if (randomNumber == 2) {
				System.out.println("February");
			}
			else if (randomNumber == 3) {
				System.out.println("March");
			}
			else if (randomNumber == 4) {
				System.out.println("April");
			}
			else if (randomNumber == 5) {
				System.out.println("May");
			}
			else if (randomNumber == 6) {
				System.out.println("June");
			}
			else if (randomNumber == 7) {
				System.out.println("July");
			}
			else if (randomNumber == 8) {
				System.out.println("August");
			}
			else if (randomNumber == 9) {
				System.out.println("September");
			}
			else if (randomNumber == 10) {
				System.out.println("October");
			}
			else if (randomNumber == 11) {
				System.out.println("November");
			}
			else {
				System.out.println("December");
			}
	}

}