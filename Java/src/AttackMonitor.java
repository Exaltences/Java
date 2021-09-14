/*
 * Ares Ton-That
 * This program is designed to keep track of the MonsterAttack objects.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AttackMonitor {

	// Create a a list for the MonsterAttack objects.
	List<MonsterAttack> listOfMonsterAttacks = new ArrayList<MonsterAttack>();

	// Create a no-arg constructor for AttackMonitor.
	public AttackMonitor() {
	}

	public List<MonsterAttack> getList() {

		return listOfMonsterAttacks;
	}

	// Create the monitor() method for AttackMonitor.
	public void monitor() {

		// Create a new scanner.
		Scanner in = new Scanner(System.in);

		// Create the user menu.
		String menu = "1. Input information on a MonsterAttack. \n" + "2. Show current list of all monster attacks. \n"
				+ "3. Delete a monster attack. \n" + "4. Exit the Program. \n" + "Please enter your choice: ";

		// Print the menu continuously until the user quits the program.
		while (true) {

			System.out.print(menu);
			int choice = in.nextInt();

			if (choice == 1) {

				inputData();
			}

			else if (choice == 2) {

				showListOfAttacks();
			}

			else if (choice == 3) {

				remove();
			}

			else if (choice == 4) {

				System.out.println("You have chosen to quit the program.");
				System.exit(0);
			}

			else {

				System.out.println("That choice does not exist.");
				System.out.print(menu);
				choice = in.nextInt();
			}
		}

	}

	public void inputData() {

		// Create a new scanner.
		Scanner in = new Scanner(System.in);

		// Get user input.
		System.out.print("Please enter the AttackID: ");
		int attackID = in.nextInt();
		in.nextLine();

		System.out.print("Please enter the date in MM/DD/YYYY format: ");
		String date = in.nextLine();

		System.out.print("Please enter the name of the monster: ");
		String nameOfMonster = in.nextLine();

		System.out.print("Please enter the location of the attack: ");
		String location = in.nextLine();

		System.out.print("Please enter the name of the reporter: ");
		String nameOfReporter = in.nextLine();

		// Create an instance of the MonsterAttack object and add it to the list
		// of monster attacks.
		MonsterAttack attack = new MonsterAttack(attackID, date, nameOfMonster, location, nameOfReporter);

		listOfMonsterAttacks.add(attack);
	}

	public void showListOfAttacks() {

		// Display the monster attack info of all attacks in the list if the
		// list is not empty.
		if (!listOfMonsterAttacks.isEmpty()) {

			for (int i = 0; i < listOfMonsterAttacks.size(); i++) {

				JOptionPane.showMessageDialog(null, listOfMonsterAttacks.get(i).toString());
			}
		}

		else {

			JOptionPane.showMessageDialog(null, "The list is empty.");
		}
	}

	public void remove() {

		// Create a new scanner.
		Scanner in = new Scanner(System.in);

		// Show the list of attacks.
		showListOfAttacks();

		// Get user input.
		System.out.print("What is the AttackID of the attack that you would like to remove? ");
		int attackID = in.nextInt();

		int index = linearSearch(listOfMonsterAttacks, attackID);

		listOfMonsterAttacks.remove(index);
	}

	public void createMonsterAttack(int attackID, String date, String nameOfMonster, String location,
			String nameOfReporter) {

		MonsterAttack attack = new MonsterAttack(attackID, date, nameOfMonster, location, nameOfReporter);

		listOfMonsterAttacks.add(attack);
	}

	public static int linearSearch(List<MonsterAttack> listOfMonsterAttacks, int key) {

		for (int i = 0; i < listOfMonsterAttacks.size(); i++) {

			if (key == listOfMonsterAttacks.get(i).getAttackID()) {

				return i;
			}
		}

		return -1;
	}
}