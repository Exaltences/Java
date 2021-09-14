
/*
 * Ares Ton-That
 * This program is designed to find the standard deviation of numbers from a text file.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandardDeviationOfFileInput {

	public static void main(String[] args) {

		// Create a new scanner.
		Scanner input = new Scanner(System.in);

		// Get user input
		System.out.print("Enter the name of the file: ");
		String fileName = input.nextLine();

		// Create our file object.
		File inFile = new File(fileName);

		if (!inFile.exists()) {
			System.out.println("This file does not exist! " + "The program will now exit.");
			System.exit(1);
		}

		// Create the output file.
		File outFile = new File("copy.txt");

		// Create our input and output streams
		Scanner in = null;
		PrintWriter out = null;

		try {
			in = new Scanner(inFile);
			out = new PrintWriter(outFile);
		} catch (FileNotFoundException ex) {

		}

		// Read each line and send it to the output file.
		while (in.hasNext()) {
			out.println(in.nextLine());
		}

		in.close();
		out.close();

		double standardDeviation = deviation(inFile, outFile);

		printDeviation(standardDeviation);
	}

	// Create a method to return the standard deviation using the numbers in the
	// file.
	public static double deviation(File inputFile, File outputFile) {

		// Create a new scanner.
		Scanner input = null;
		PrintWriter output = null;

		try {
			input = new Scanner(inputFile);
			output = new PrintWriter(outputFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		double number = 0;
		double sum = 0;
		double sumSquared = 0;
		double termCount = 0;

		while (input.hasNext()) {

			number = input.nextDouble();
			sum += number;
			sumSquared += Math.pow(number, 2);
			termCount++;
		}

		double standardDeviation = Math.sqrt(((sumSquared - Math.pow(sum, 2) / termCount) / (termCount - 1)));

		return standardDeviation;
	}

	public static void printDeviation(double standardDeviation) {
		System.out.println("The standard deviation of the values in this file is: " + standardDeviation);
	}

}