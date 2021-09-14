
/*
 * Ares Ton-That
 * This program is designed to validate a credit card number.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class CreditCardValidator {

	public static void main(String[] args) {

		PrintWriter out = null;

		// Create a JFileChooser object.
		JFileChooser jfc = new JFileChooser();

		int option = jfc.showOpenDialog(null);
		File chosenFile = null;

		if (option == jfc.APPROVE_OPTION) {
			chosenFile = jfc.getSelectedFile();
			if (!chosenFile.exists()) {
				System.out.println("This file does not exist. The program will now exit.");
				System.exit(1);
			}
		}

		else if (option == jfc.CANCEL_OPTION) {
			System.out.println("You chose cancel. The program will now exit.");
			System.exit(0);
		}

		else if (option == jfc.ERROR_OPTION) {
			System.out.println("There was some kind of error. The program will now exit.");
			System.exit(1);
		}

		// Create a new scanner
		Scanner in = null;

		try {
			in = new Scanner(chosenFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			out = new PrintWriter("output_file.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String data = "";
		int sum1 = 0;
		int sum2 = 0;
		int totalSum = 0;

		while (in.hasNext()) {

			data = in.next();

			sum1 = addEverySecondDigit(data);
			sum2 = addDigitsInOddPlaces(data);
			totalSum = getTotalSum(sum1, sum2);

			if (totalSum % 10 != 0 || data.length() < 13 || data.length() > 16) {

				if (data.startsWith("4")) {
					out.print(data);
					out.printf("%20s", "Visa");
					out.printf("%10s", "Invalid\n");
				}

				else if (data.startsWith("5")) {
					out.print(data);
					out.printf("%20s", "Master Card");
					out.printf("%10s", "Invalid\n");
				}

				else if (data.startsWith("6")) {
					out.print(data);
					out.printf("%20s", "Discover Card");
					out.printf("%10s", "Invalid\n");
				}

				else if (data.startsWith("34") || data.startsWith("37")) {
					out.print(data);
					out.printf("%20s", "American Express");
					out.printf("%10s", "Invalid\n");
				}

				else {
					out.print(data);
					out.printf("%20s", "None");
					out.printf("%10s", "Invalid\n");
				}
			}

			else if (totalSum % 10 == 0 && data.length() >= 13 && data.length() <= 16) {

				if (data.startsWith("4")) {
					out.print(data);
					out.printf("%20s", "Visa");
					out.printf("%10s", "Valid\n");
				}

				else if (data.startsWith("5")) {
					out.print(data);
					out.printf("%20s", "Master Card");
					out.printf("%10s", "Valid\n");
				}

				else if (data.startsWith("6")) {
					out.print(data);
					out.printf("%20s", "Discover Card");
					out.printf("%10s", "Valid\n");
				}

				else if (data.startsWith("34") || data.startsWith("37")) {
					out.print(data);
					out.printf("%20s", "American Express");
					out.printf("%10s", "Valid\n");
				}

				else {
					out.print(data);
					out.printf("%20s", "None");
					out.printf("%10s", "Valid\n");
				}
			}

		}

		out.close();
	}

	public static int addDigits(int number) {
		int firstDigit = number % 10;
		int secondDigit = number / 10;

		int addDigits = firstDigit + secondDigit;

		return addDigits;
	}

	public static int addEverySecondDigit(String data) {

		int everySecondDigit = 0;
		int firstDigit = 0;
		int secondDigit = 0;
		int sum = 0;

		for (int i = data.length() - 2; i >= 0; i -= 2) {
			everySecondDigit = (int) (data.charAt(i) - '0');
			everySecondDigit *= 2;

			if (everySecondDigit >= 10) {
				sum += addDigits(everySecondDigit);
			}

			else {
				sum += everySecondDigit;
			}
		}

		return sum;
	}

	public static int addDigitsInOddPlaces(String data) {

		int oddDigits = 0;
		int sum = 0;


			for (int i = data.length() - 1; i >= 0; i -= 2) {
				oddDigits = (int) (data.charAt(i) - '0');
				sum += oddDigits;
			}
			
		return sum;
	}

	public static int getTotalSum(int sum1, int sum2) {
		int sum3 = sum1 + sum2;

		return sum3;
	}

}