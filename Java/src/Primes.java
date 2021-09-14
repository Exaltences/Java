
/*
 * Ares Ton-That
 * This program is designed print mirrored primes and prime 
 * palindromes based on user input.
 */
import java.util.Scanner;

public class Primes {

	public static void main(String[] args) {

		// Create a new scanner.
		Scanner input = new Scanner(System.in);

		System.out.print(menu());
		int choice = input.nextInt();
		int numberOfPrimePalindromes = 0;
		int numberOfMirroredPrimes = 0;

		while (choice == 1 || choice == 2) {

			if (choice == 1) {
				System.out.print("How many prime palindromes to display? ");
				numberOfPrimePalindromes = input.nextInt();
				
				printPrimePalindromes(numberOfPrimePalindromes);
			}

			else if (choice == 2) {
				
				System.out.print("How many mirrored primes to display? ");
				numberOfMirroredPrimes = input.nextInt();
				
				printMirroredPrimes(numberOfMirroredPrimes);
			}

			System.out.print("\n" + menu());
			choice = input.nextInt();
		}

		while (choice < 1 || choice > 3) {
			System.out.println("That menu choice is not valid. Please try again.");

			System.out.print(menu());
			choice = input.nextInt();

			if (choice == 1) {
				System.out.print("How many prime palindromes to display? ");
				numberOfPrimePalindromes = input.nextInt();
				
				printPrimePalindromes(numberOfPrimePalindromes);
				
			}

			else if (choice == 2) {
				System.out.print("How many mirrored primes to display? ");
				numberOfMirroredPrimes = input.nextInt();
				
				printMirroredPrimes(numberOfMirroredPrimes);
				
				
			}

			System.out.print("\n" + menu());
			choice = input.nextInt();
		}
	}

	// Create a method for the menu.
	public static String menu() {

		final String menu = "1. Display Prime Palindromes\n" + "2. Display Mirrored Primes\n" + "3. Exit program\n"
				+ "Enter your choice: ";

		return menu;
	}

	public static boolean isPrime(int number) {

		if (number < 2) {

			return false;
		}

		for (int i = 2; i <= number / 2; i++) {

			if (number % i == 0) {
				return false;
			}

		}

		return true;
	}

	public static int reverseNumber(int number) {

		int reverseNumber = 0;

		while (number != 0) {
			reverseNumber *= 10;
			reverseNumber = reverseNumber + number % 10;
			number /= 10;
		}

		return reverseNumber;
	}

	public static boolean isAPalindrome(int number) {

		return (number == reverseNumber(number));
	}
	
	public static void printPrimePalindromes(int numberOfPrimePalindromes) {
		
		int counter = 0;

		for (int i = 1; counter < numberOfPrimePalindromes; i++) {

			if (isPrime(i) && isAPalindrome(i)) {

				counter++;

				if (counter % 10 == 0) {
					System.out.printf("%-5d\n", i);
				}

				else {
					System.out.printf("%-5d", i);
				}
			}
		}
	}
	
	public static void printMirroredPrimes(int numberOfMirroredPrimes) {
		
		int counter = 0;
		
		for (int i = 1; counter < numberOfMirroredPrimes; i++) {
			
			if (isAPalindrome(i) == false && isPrime(i) && isPrime(reverseNumber(i))) {
				counter++;
				
				if (counter % 10 == 0) {
					System.out.printf("%-5d\n", i);
				}
				
				else {
					System.out.printf("%-5d", i);
				}
			}
		}
	}
	
}