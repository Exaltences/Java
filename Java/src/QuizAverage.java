/*
 * Ares Ton-That
 * This program is designed to take 10 quiz scores, drop the two lowest scores,
 * and compute the average of the remaining 8 scores.
 */

import java.util.Scanner;

public class QuizAverage {

	public static void main(String[] args) {

		// Create a new scanner.
		Scanner input = new Scanner(System.in);

		// Get user input.
		System.out.println("Enter the ten scores: ");
		double score1 = input.nextDouble();
		double score2 = input.nextDouble();
		double score3 = input.nextDouble();
		double score4 = input.nextDouble();
		double score5 = input.nextDouble();
		double score6 = input.nextDouble();
		double score7 = input.nextDouble();
		double score8 = input.nextDouble();
		double score9 = input.nextDouble();
		double score10 = input.nextDouble();

		score1 = readQuizScore(score1);
		score2 = readQuizScore(score2);
		score3 = readQuizScore(score3);
		score4 = readQuizScore(score4);
		score5 = readQuizScore(score5);
		score6 = readQuizScore(score6);
		score7 = readQuizScore(score7);
		score8 = readQuizScore(score8);
		score9 = readQuizScore(score9);
		score10 = readQuizScore(score10);

		double sum = score1 + score2 + score3 + score4 + score5
				+ score6 + score7 + score8 + score9 + score10;

		double lowestScore = getLowestScore(score1, score2, score3, score4, 
				score5, score6, score7, score8, score9, score10);
		
		double secondLowestScore = getSecondLowestScore(score1, score2, score3,
				score4, score5, score6, score7, score8, score9, score10, 
				lowestScore);
		
		sum -= lowestScore;
		sum -= secondLowestScore;
		
		double average = computeAverage(sum, 8);
		
		System.out.println("Two lowest scores: " + lowestScore + " and " 
		+ secondLowestScore);
		
		System.out.printf("Average: %.2f", average);
	}

	// Create methods to store the data.
	public static double readQuizScore(double score) {

		if (score < 0 || score > 100) {
			System.out.println("Score is invalid. Program will now exit.");
			System.exit(1);
		}

		return score;

	}

	public static double getLowestScore(double score1, double score2, 
			double score3, double score4, double score5, double score6, 
			double score7, double score8, double score9, double score10) {

		double lowestScore = 100;

		if (score1 < lowestScore) {
			lowestScore = score1;
		}

		if (score2 < lowestScore) {
			lowestScore = score2;
		}

		if (score3 < lowestScore) {
			lowestScore = score3;
		}

		if (score4 < lowestScore) {
			lowestScore = score4;
		}

		if (score5 < lowestScore) {
			lowestScore = score5;
		}

		if (score6 < lowestScore) {
			lowestScore = score6;
		}

		if (score7 < lowestScore) {
			lowestScore = score7;
		}

		if (score8 < lowestScore) {
			lowestScore = score8;
		}

		if (score9 < lowestScore) {
			lowestScore = score9;
		}

		if (score10 < lowestScore) {
			lowestScore = score10;
		}

		return lowestScore;
	}

	public static double getSecondLowestScore(double score1, double score2, 
			double score3, double score4, double score5, double score6, 
			double score7, double score8, double score9, double score10, double lowestScore) {
		
		double secondLowestScore = 100;

		if (score1 < secondLowestScore && score1 > lowestScore) {
			secondLowestScore = score1;
		}

		if (score2 < secondLowestScore && score2 > lowestScore) {
			secondLowestScore = score2;
		}

		if (score3 < secondLowestScore && score3 > lowestScore) {
			secondLowestScore = score3;
		}

		if (score4 < secondLowestScore && score4 > lowestScore) {
			secondLowestScore = score4;
		}

		if (score5 < secondLowestScore && score5 > lowestScore) {
			secondLowestScore = score5;
		}

		if (score6 < secondLowestScore && score6 > lowestScore) {
			secondLowestScore = score6;
		}

		if (score7 < secondLowestScore && score7 > lowestScore) {
			secondLowestScore = score7;
		}

		if (score8 < secondLowestScore && score8 > lowestScore) {
			secondLowestScore = score8;
		}

		if (score9 < secondLowestScore && score9 > lowestScore) {
			secondLowestScore = score9;
		}

		if (score10 < secondLowestScore && score10 > lowestScore) {
			secondLowestScore = score10;
		}
		
		return secondLowestScore;
	}

	public static double computeAverage(double sum, double n) {

		double average = sum / n;

		return average;
	}

}