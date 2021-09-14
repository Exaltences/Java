/*
 * Ares Ton-That
 * This program is designed to ask the user to solve the type of math problem
 * of their choosing.
 */
import java.util.Scanner;

public class SolveMathProblems {

	public static void main(String[] args) {
		
		//Create a new scanner.
		Scanner input = new Scanner(System.in);
		
		//Create user menu.
		final String MENU = 
				"Math Tutor Menu\n" +
				"1. Addition Problem\n" +
				"2. Subtraction Problem\n" +
				"3. Multiplication Problem\n" +
				"4. Random Problem\n" +
				"Enter your choice: ";
		
		//Create constants for the menu choices.
		final int ADDITION_PROBLEM_CHOICE = 1;
		final int SUBTRACTION_PROBLEM_CHOICE = 2;
		final int MULTIPLICATION_PROBLEM_CHOICE = 3;
		final int RANDOM_PROBLEM_CHOICE = 4;
		
		//Display the menu and obtain user's input.
		System.out.print(MENU);
		int userChoice = input.nextInt();
		
		if (userChoice < 1 || userChoice > 4) {
			System.out.println("That choice does not exist.");
			System.out.println("The program will now exit.");
			System.exit(1);
		}
		
			//Create conditions that generate a math problem based on user input.
			int numberOne = (int)(Math.random() * 100) + 1;
			int numberTwo = (int)(Math.random() * 100) + 1;
			int result = 0;
			int answer = 0;
			int randomProblemOperator = 0;
			
			switch (userChoice) {
			case ADDITION_PROBLEM_CHOICE:
				System.out.println("What is " + numberOne + " + " + numberTwo + "?");
				answer = input.nextInt();
				result = numberOne + numberTwo;
				
				if (result == answer) {
					System.out.println("You are correct!");
				}
				else if (result != answer) {
					System.out.println("Your answer was wrong.");
					System.out.println("The sum of " + numberOne + " and " +
										numberTwo + " is " + result + ".");
				}
				
				break;
				
			case SUBTRACTION_PROBLEM_CHOICE:
				
					System.out.println("What is " + numberOne + " - " + numberTwo + "?");
					answer = input.nextInt();
					result = numberOne - numberTwo;
					
					if (result == answer) {
						System.out.println("You are correct!");
					}
					else if (result != answer) {
						System.out.println("Your answer was wrong.");
						System.out.println("The difference of " + numberOne + " and " +
											numberTwo + " is " + result + ".");
					}
					
			
				
					break;
					
				case MULTIPLICATION_PROBLEM_CHOICE:
				System.out.println("What is " + numberOne + " * " + numberTwo + "?");
				answer = input.nextInt();
				result = numberOne * numberTwo;
				
				if (result == answer) {
					System.out.println("You are correct!");
				}
				else if (result != answer) {
					System.out.println("Your answer was wrong.");
					System.out.println("The product of " + numberOne + " and " +
										numberTwo + " is " + result + ".");
					}
					break;
					
				case RANDOM_PROBLEM_CHOICE:
					randomProblemOperator = (int)(Math.random() * 3) + 1;
					
					if (randomProblemOperator == 1) {
						System.out.println("What is " + numberOne + " + " + numberTwo + "?");
				answer = input.nextInt();
				result = numberOne + numberTwo;
				
				if (result == answer) {
					System.out.println("You are correct!");
				}
				else if (result != answer) {
					System.out.println("Your answer was wrong.");
					System.out.println("The sum of " + numberOne + " and " +
										numberTwo + " is " + result + ".");
				}
			}
			else if (randomProblemOperator == 2) {
				System.out.println("What is " + numberOne + " - " + numberTwo + "?");
					answer = input.nextInt();
					result = numberOne - numberTwo;
					
					if (result == answer) {
						System.out.println("You are correct!");
					}
					else if (result != answer) {
						System.out.println("Your answer was wrong.");
						System.out.println("The difference of " + numberOne + " and " +
											numberTwo + " is " + result + ".");
					}
			}
			else if (randomProblemOperator == 3) {
				System.out.println("What is " + numberOne + " * " + numberTwo + "?");
				answer = input.nextInt();
				result = numberOne * numberTwo;
				
				if (result == answer) {
					System.out.println("You are correct!");
				}
				else if (result != answer) {
					System.out.println("Your answer was wrong.");
					System.out.println("The product of " + numberOne + " and " +
										numberTwo + " is " + result + ".");
					}
			}
		}
		
		input.close();
	}
}