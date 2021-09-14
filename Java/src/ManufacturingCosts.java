/*
 * Ares Ton-That
 * This program is designed to display the cost of manufacturing different 
 * devices, as well as the highest and lowest cost devices
 */

public class ManufacturingCosts {

	public static void main(String[] args) {

		// Create the table
		double[][] table = new double[6][7];

		table = createTable();

		String[] names = new String[5];

		names = names();

		double[] costs = new double[7];

		costs = costs();

		double[] totalCosts = new double[table.length];

		// Display the costs.

		for (int i = 0; i < table.length; i++) {

			for (int j = 0; j < table[i].length; j++) {

				totalCosts[i] += table[i][j] * costs[j];

			}

			System.out.print(names[i] + " Cost: ");
			System.out.printf("%.2f", totalCosts[i]);
			System.out.println();
		}

		// Find the highest and lowest costs.
		double max = totalCosts[0];
		double min = totalCosts[0];
		int indexOfHighest = 0;
		int indexOfLowest = 0;

		for (int i = 0; i < totalCosts.length; i++) {

			if (totalCosts[i] > max) {

				max = totalCosts[i];
				indexOfHighest = i;
			}

			if (totalCosts[i] < min) {

				min = totalCosts[i];
				indexOfLowest = i;
			}
		}

		System.out.println("Highest Cost Device: " + names[indexOfHighest]);
		System.out.println("Lowest Cost Device: " + names[indexOfLowest]);

	}

	public static double[][] createTable() {

		double[][] table = { { 9, 13, 4, 7, 1, 14, 10 }, { 8, 2, 12, 11, 6, 15, 2 }, { 9, 6, 7, 10, 15, 8, 3 },
				{ 12, 14, 8, 15, 2, 7, 8 }, { 12, 10, 3, 11, 8, 3, 5 } };

		return table;
	}

	public static String[] names() {

		String[] names = { "MP3 Player", "Smart Phone", "Digital Watch", "Tablet", "Portable Gaming System" };

		return names;
	}

	public static double[] costs() {

		double[] costs = { 10.75, 15.27, 5.98, 9.67, 4.32, 12.50, 1.42 };

		return costs;
	}
}