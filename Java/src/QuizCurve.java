/*
 * Ares Ton-That
 * This program is designed to read a file of quiz scores, find the best score, and
 * grade other quizzes based on that score.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class QuizCurve {

	public static void main(String[] args) {

		// Get user file.
		JFileChooser jfc = new JFileChooser();

		int jfcUserOption = jfc.showOpenDialog(null);
		File chosenFile = null;

		if (jfcUserOption == jfc.APPROVE_OPTION) {
			chosenFile = jfc.getSelectedFile();
		}

		else if (jfcUserOption == jfc.CANCEL_OPTION) {
			System.out.println("You chose cancel. The program will now exit.");
			System.exit(0);
		}

		else if (jfcUserOption == jfc.ERROR_OPTION) {
			System.out.println("There was an error. The program will now exit.");
			System.exit(1);
		}

		// Create a new scanner.
		Scanner in = null;

		try {
			in = new Scanner(chosenFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String firstLine = in.nextLine();

		int size = Integer.parseInt(firstLine);
		double[] listOfScores = new double[size];
		double data = 0;
		double bestScore = 0;
		int j = 1;

		// Create the array and perform various functions.
		while (in.hasNext()) {

			data = in.nextDouble();

			for (int i = 0; i < size; i++) {
				listOfScores[i] = data;
			}

			for (int i = 1; i < listOfScores.length; i++) {

				if (listOfScores[i] > bestScore) {
					bestScore = listOfScores[i];
				}
			}

			printScores(listOfScores, bestScore, j);
			j++;
		}
	}

	public static void printScores(double[] listOfScores, double bestScore, int j) {

		for (int i = 1; i < 2; i++) {

			if (listOfScores[i] >= bestScore - 15) {
				System.out.println("Student " + j + " score is " + listOfScores[i] + " and grade is A");
			}

			else if (listOfScores[i] >= bestScore - 25) {
				System.out.println("Student " + j + " score is " + listOfScores[i] + " and grade is B");
			}

			else if (listOfScores[i] >= bestScore - 35) {
				System.out.println("Student " + j + " score is " + listOfScores[i] + " and grade is C");
			}

			else if (listOfScores[i] >= bestScore - 45) {
				System.out.println("Student " + j + " score is " + listOfScores[i] + " and grade is D");
			}

			else {
				System.out.println("Student " + j + " score is " + listOfScores[i] + " and grade is F");
			}
		}
	}

}