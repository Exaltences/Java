
public class Recursion {

	public static void main(String[] args) {
		
		System.out.println(powerN(2, 3));
		System.out.println(harmonicSum(4));
		reverseDisplay(115);
		reverseDisplay("ILoveBrynnRumfallo");
		System.out.println(recursiveContains('r', "brynn"));
		System.out.println(recursiveAllCharactersSame("aaaaaaa"));
		System.out.println(recursiveCount('b', "brynnrumfallo"));
	}

	public static double powerN(double x, int n) {

		// Base case: if n is 0, return 1 since any number to the power of 0 is
		// 1.
		if (n == 0) {

			return 1;
		}

		// If n is greater than 0, keep multiplying x while n is greater than 0.
		else if (n > 0) {

			return 1.0 * x * powerN(x, n - 1);
		}

		// If n is less than 0, keep multiplying x and take the reciprocal while
		// n is less than 0.
		else {

			return 1.0 / (x * powerN(x, -n - 1));
		}
	}

	public static double harmonicSum(int n) {

		int result = n;

		// Base case: 1/1 is 1.
		if (n == 1) {

			return 1;
		}

		// If n is greater than 1 return the summation of 1 / n, 1 / n - 1 ...
		// while n is greater than 1.
		else {

			return 1.0 / n + harmonicSum(n - 1);
		}
	}

	public static void reverseDisplay(int value) {

		// If number is only 1 digit, the number is already in reverse order.
		if (value < 10) {

			System.out.println(value);
		}

		// If number is multiple digits, print the last digit in the number and
		// divide the number by 10, running the method again.
		else {

			System.out.print(value % 10);
			reverseDisplay(value / 10);
		}
	}

	public static void reverseDisplay(String value) {

		// If length is 0, the string is empty.
		if (value.length() == 0) {

			System.out.println("");
		}

		// If length is 1, the string is already reversed.
		else if (value.length() == 1) {

			System.out.println(value);
		}

		// Print the last character and call the method again with the string
		// minus the last character.
		else {

			System.out.print(value.charAt(value.length() - 1));
			reverseDisplay(value.substring(0, value.length() - 1));
		}
	}

	public static boolean recursiveContains(char c, String s) {

		s.toLowerCase();

		// Base case: Empty String does not contain any characters.
		if (s.length() == 0) {

			return false;
		}

		// If the first character is the same as the character c, return true.
		else if (s.charAt(0) == c) {

			return true;
		}

		// Perform recursion by stripping the first character of string s.
		else {

			return recursiveContains(c, s.substring(1, s.length()));
		}
	}

	public static boolean recursiveAllCharactersSame(String s) {

		// Base Case: In an empty string or a string of length 1, all characters
		// are the same.
		if (s.length() == 0 || s.length() == 1) {

			return true;
		}

		// If the first character does not equal the second, return false.
		else if (s.charAt(0) != s.charAt(1)) {

			return false;
		}

		// Run recursion by stripping the first character of string s.
		else {

			return recursiveAllCharactersSame(s.substring(1, s.length()));
		}
	}

	public static int recursiveCount(char c, String s) {

		// Start with count of 1.
		int count = 1;

		// If the string is empty, return 0.
		if (s.isEmpty()) {

			return 0;
		}

		// Run recursion by stripping a single character from the string and
		// adding 1 to the count each time.
		else {

			return count + recursiveCount(c, s.substring(1, s.length()));
		}
	}
}