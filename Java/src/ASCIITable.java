/*
 * Ares Ton-That
 * This program is designed to print a table of ASCII characters from ! to ~.
 */

public class ASCIITable {

	public static void main(String[] args) {

		// Initialize a char variable to convert i to a char.
		char character = ' ';

		// Create a loop to generate the table.
		for (int i = 33; i <= 126; i++) {
			character = (char) (i);
			System.out.print(character);

			if ((i - 32) % 10 == 0) {
				System.out.println();
			}
		}
	}

}