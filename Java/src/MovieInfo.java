/*
 * Ares Ton-That
 * This program is designed to calculate date about various movie showings.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MovieInfo {

	public static void main(String[] args) {

		// Create a new scanner.
		Scanner in = new Scanner(System.in);

		// Get sizes for the arrays.

		System.out.print("How many movies are showing? ");
		int numberOfMovies = in.nextInt();

		System.out.print("How many different prices are there? ");
		int numberOfPrices = in.nextInt();

		System.out.print("How many rows are there for the attendance? ");
		int rows = in.nextInt();

		System.out.print("How many columns are there for the attendance? ");
		int columns = in.nextInt();

		String[] movieNames = new String[numberOfMovies];

		double[] prices = new double[numberOfPrices];

		int[][] attendance = new int[rows][columns];

		// Get movie names.
		System.out.print("Enter the movie names: ");

		for (int i = 0; i < movieNames.length; i++) {

			movieNames[i] = in.next();
		}

		// Get the prices.
		System.out.print("Enter the prices: ");

		for (int i = 0; i < prices.length; i++) {

			prices[i] = in.nextDouble();
		}

		// Get the number of people attending.
		System.out.print("Enter the number of people attending for each showing: ");

		for (int i = 0; i < attendance.length; i++) {

			for (int j = 0; j < attendance[i].length; j++) {

				attendance[i][j] = in.nextInt();
			}
		}

		String[] showings = new String[15];

		for (int i = 0; i < showings.length; i++) {

			showings[i] = "Showing " + (i + 1);
		}

		System.out.print("               ");

		for (int i = 0; i < showings.length; i++) {

			System.out.print(showings[i] + "    ");
		}

		System.out.println();

		for (int i = 0; i < attendance.length; i++) {

			System.out.print(movieNames[i] + "    ");

			for (int j = 0; j < attendance[i].length; j++) {

				System.out.print(attendance[i][j] + "          ");
			}

			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < showings.length; i++) {

			System.out.print(showings[i] + "     ");
		}

		System.out.println();

		for (int i = 0; i < prices.length; i++) {

			System.out.print(prices[i] + "          ");
		}
		
		displayAverageNumberOfPeoplePerMovie(attendance, movieNames);
		
		double[] totalSales = new double[movieNames.length];
		
		totalSales = totalSales(attendance, prices);
		
		displayTotalSales(totalSales, movieNames);
		
		displayMovieWithHighestSales(totalSales, movieNames);
		
		displayMovieWithLowestSales(totalSales, movieNames);
	}

	public static void displayAverageNumberOfPeoplePerMovie(int[][] attendance, String[] movieNames) {
		
		System.out.println("Average People Per Movie");
		
		for (int i = 0; i < attendance.length; i++) {
			
			int sum = 0;
			System.out.print(movieNames[i] + "     ");
			
			for (int j = 0; j < attendance[i].length; j++) {
				
				sum += attendance[i][j];
			}
			
			int average = sum / attendance[0].length;
			
			System.out.println(average);
		}
	}
	
	public static double[] totalSales(int[][] attendance, double[] prices) {
		
		double[] totalSales = new double[attendance.length];
		
		
		for (int i = 0; i < attendance.length; i++) {
			
			for (int j = 0; j < attendance[i].length; j++) {
				
					totalSales[i] += (attendance[i][j] * prices[j]);
				
			}
		}
		
		return totalSales;
	}
	
	public static void displayTotalSales(double[] totalSales, String[] movieName) {
		
		System.out.println("Total Sales Per Movie ");
		
		for (int i = 0; i < totalSales.length; i++) {
			
			System.out.print(movieName[i] + "     ");
			System.out.println(totalSales[i]);
		}
	}
	
	public static void displayMovieWithHighestSales(double[] totalSales, String[] movieName) {
		
		double max = totalSales[0];
		String index = "";
		
		for (int i = 1; i < totalSales.length; i++) {
			
			if (totalSales[i] > max) {
				
				max = totalSales[i];
				
				index = movieName[i];
			}
		}
		
		System.out.println("Highest Sales: " + index);
	}
	
	public static void displayMovieWithLowestSales(double[] totalSales, String[] movieName) {
		
		double min = totalSales[0];
		String index = "";
		
		for (int i = 0; i < totalSales.length; i++) {
			
			if (totalSales[i] < min) {
				
				min = totalSales[i];
				
				index = movieName[i];
			}
		}
		
		System.out.println("Lowest Sales: " + index);
	}

}