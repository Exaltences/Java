/*
 * Ares Ton-That
 * This program is designed to model a university.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class University {

	private List<Student> listOfStudents = new ArrayList<Student>();
	private List<FacultyMember> listOfFacultyMembers = new ArrayList<FacultyMember>();
	private List<Course> listOfCourses = new ArrayList<Course>();

	// Create a default constructor for the University Class.
	public University() {

	}

	// Create a constructor with data fields for the University Class.
	public University(List<Student> listOfStudents, List<FacultyMember> listOfFacultyMembers,
			List<Course> listOfCourses) {

		this.listOfStudents = listOfStudents;
		this.listOfFacultyMembers = listOfFacultyMembers;
		this.listOfCourses = listOfCourses;
	}

	// Create getter and setter methods for the data fields in the University
	// class.
	public List<Student> getListOfStudents() {
		return listOfStudents;
	}

	public void setListOfStudents(List<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}

	public List<FacultyMember> getListOfFacultyMembers() {
		return listOfFacultyMembers;
	}

	public void setListOfFacultyMembers(List<FacultyMember> listOfFacultyMembers) {
		this.listOfFacultyMembers = listOfFacultyMembers;
	}

	public List<Course> getListOfCourses() {
		return listOfCourses;
	}

	public void setListOfCourses(List<Course> listOfCourses) {
		this.listOfCourses = listOfCourses;
	}

	// Create a method to show the menu.
	public void showMenu() {

		// Create the menu.
		String menu = "1. Show the list of students. \n" + "2. Show the list of faculty members. \n"
				+ "3. Show the list of courses. \n" + "4. Add a student to the list of students. \n"
				+ "5. Add a faculty member to the list of faculty members. \n"
				+ "6. Add a course to the list of courses. \n" + "7. Delete a student from the list of students. \n"
				+ "8. Delete a faculty member from the list of faculty members. \n"
				+ "9. Add a course for a student. \n" + "10. Add a course for a faculty member. \n"
				+ "11. Delete a course for a student. \n" + "12. Delete a course for a faculty member. \n"
				+ "13. Exit the program. \n" + "Enter your choice: ";

		// Create a new scanner.
		Scanner in = new Scanner(System.in);

		// Print the menu.
		while (true) {

			System.out.println(menu);
			int choice = in.nextInt();
			in.nextLine();

			if (choice == 1) {

				showListOfStudents();
			}

			else if (choice == 2) {

				showListOfFacultyMembers();
			}

			else if (choice == 3) {

				showListOfCourses();
			}

			else if (choice == 4) {

				addStudent();
			}

			else if (choice == 5) {

				addFacultyMember();
			}

			else if (choice == 6) {

				addCourse();
			}

			else if (choice == 7) {

				deleteStudentFromList();
			}

			else if (choice == 8) {

				deleteFacultyMemberFromList();
			}

			else if (choice == 9) {

				addClassStudent();
			}

			else if (choice == 10) {

				addClassFacultyMember();
			}

			else if (choice == 11) {

				deleteClassStudent();
			}

			else if (choice == 12) {

				deleteClassFacultyMember();
			}

			else if (choice == 13) {

				System.out.println("You have chosen to quit the program.");
				System.exit(0);
			}

			else {
				System.out.println("That choice does not exist. Please enter another choice.");
				System.out.println(menu);
				choice = in.nextInt();
				in.nextLine();
			}
		}
	}

	public void showListOfStudents() {

		// Display the list of students.
		for (int i = 0; i < listOfStudents.size(); i++) {

			System.out.print(listOfStudents.get(i) + " ");

			if (i % 5 == 0) {

				System.out.println();
			}
		}
	}

	public void showListOfFacultyMembers() {

		// Display the list of faculty members.
		for (int i = 0; i < listOfFacultyMembers.size(); i++) {

			System.out.print(listOfFacultyMembers.get(i) + " ");

			if (i % 5 == 0) {

				System.out.println();
			}
		}
	}

	public void showListOfCourses() {

		// Display the list of courses.
		for (int i = 0; i < listOfCourses.size(); i++) {

			System.out.print(listOfCourses.get(i) + " ");

			if (i % 5 == 0) {

				System.out.println();
			}
		}
	}

	public void addStudent() {

		// Create a new scanner.
		Scanner in = new Scanner(System.in);

		// Get user input.
		System.out.print("What is the student's street number? ");
		int streetNumber = in.nextInt();
		in.nextLine();

		System.out.print("What is the student's street name? ");
		String streetName = in.nextLine();

		System.out.print("What is the student's city? ");
		String city = in.nextLine();

		System.out.print("What is the student's state or province? ");
		String stateOrProvince = in.nextLine();

		System.out.print("What is the student's country? ");
		String country = in.nextLine();

		System.out.print("What is the student's name? ");
		String name = in.nextLine();

		System.out.print("What is the student's cin? ");
		int cin = in.nextInt();

		// Create a new student using user input.
		Student student = new Student(streetNumber, streetName, city, stateOrProvince, country, name, cin);

		// Add the student to the list of students.
		listOfStudents.add(student);
	}

	public void addFacultyMember() {

		// Create a new scanner.
		Scanner in = new Scanner(System.in);

		// Get user input.
		System.out.print("What is the faculty member's street number? ");
		int streetNumber = in.nextInt();
		in.nextLine();

		System.out.print("What is the faculty member's street name? ");
		String streetName = in.nextLine();

		System.out.print("What is the faculty member's city? ");
		String city = in.nextLine();

		System.out.print("What is the faculty member's state or province? ");
		String stateOrProvince = in.nextLine();

		System.out.print("What is the faculty member's country? ");
		String country = in.nextLine();

		System.out.print("What is the faculty member's name? ");
		String name = in.nextLine();

		System.out.print("What is the faculty member's employee ID? ");
		int employeeID = in.nextInt();

		// Create a new faculty member using user input.
		FacultyMember teacher = new FacultyMember(streetNumber, streetName, city, stateOrProvince, country, name,
				employeeID);

		// Add the faculty member to the list of faculty members.
		listOfFacultyMembers.add(teacher);
	}

	public void addCourse() {

		// Create a new scanner.
		Scanner in = new Scanner(System.in);

		// Get user input.
		System.out.print("What is the course identifier? ");
		String courseIdentifier = in.nextLine();

		System.out.print("How many units is the class worth? ");
		int units = in.nextInt();

		// Create a new course using user input.
		Course course = new Course(courseIdentifier, units);

		// Add the course to the list of courses.
		listOfCourses.add(course);

	}

	public void deleteStudentFromList() {

		// Create a new scanner.
		Scanner in = new Scanner(System.in);

		// Display the list of students, calling the toString() method of
		// Student.
		for (int i = 0; i < listOfStudents.size(); i++) {

			System.out.println(listOfStudents.get(i).toString());
		}

		// Get user input.
		System.out.print("What is the cin number of the student you want to delete from this list? ");
		int key = in.nextInt();

		// Use linear search to find the Student and delete them from the list.
		for (int i = 0; i < listOfStudents.size(); i++) {

			if (key == listOfStudents.get(i).getCin()) {

				listOfStudents.remove(i);
			}
		}
	}

	public void deleteFacultyMemberFromList() {

		// Create a new scanner.
		Scanner in = new Scanner(System.in);

		// Display the list of faculty members, calling the toString() method of
		// FacultyMember.
		for (int i = 0; i < listOfFacultyMembers.size(); i++) {

			System.out.println(listOfFacultyMembers.get(i).toString());
		}

		// Get user input.
		System.out.print("What is the ID number of the faculty member you would like to delete from this list? ");
		int key = in.nextInt();

		// Use linear search to find the faculty member and delete them from the
		// list.
		for (int i = 0; i < listOfFacultyMembers.size(); i++) {

			if (key == listOfFacultyMembers.get(i).getEmployeeID()) {

				listOfFacultyMembers.remove(i);
			}
		}
	}

	public void addClassStudent() {

		// Create a new scanner.
		Scanner in = new Scanner(System.in);

		// Get student's cin.
		System.out.print("What is your cin? ");
		int cin = in.nextInt();
		int index = 0;

		// Use linear search to find the student.
		for (int i = 0; i < listOfStudents.size(); i++) {

			if (cin == listOfStudents.get(i).getCin()) {

				index = i;
			}
		}

		// Display the list of courses.
		for (int i = 0; i < listOfCourses.size(); i++) {

			System.out.println(listOfCourses.get(i).toString());
		}

		// Get user input.
		System.out.println("Which course would you like to add (The first course is 0, not 1)? ");
		int choice = in.nextInt();

		listOfStudents.get(index).add(listOfCourses.get(choice));
	}

	public void addClassFacultyMember() {

		// Create a new scanner.
		Scanner in = new Scanner(System.in);

		// Get faculty member's ID.
		System.out.print("What is your employee ID number? ");
		int employeeID = in.nextInt();
		int index = 0;

		// Use linear search to find the faculty member.
		for (int i = 0; i < listOfFacultyMembers.size(); i++) {

			if (employeeID == listOfFacultyMembers.get(i).getEmployeeID()) {

				index = i;
			}
		}

		// Display the list of courses.
		for (int i = 0; i < listOfCourses.size(); i++) {

			System.out.println(listOfCourses.get(i).toString());
		}

		// Get user input.
		System.out.println("Which course would you like to teach (The first course is 0, not 1)? ");
		int choice = in.nextInt();

		listOfFacultyMembers.get(index).teach(listOfCourses.get(choice));
	}

	public void deleteClassStudent() {

		// Create a new scanner.
		Scanner in = new Scanner(System.in);

		// Get student's cin.
		System.out.println("What is your cin? ");
		int cin = in.nextInt();
		int index = 0;

		// Use linear search to find the student.
		for (int i = 0; i < listOfStudents.size(); i++) {

			if (cin == listOfStudents.get(i).getCin()) {

				index = i;
			}
		}

		// Display the student's current classes.
		System.out.println("Here are the classes that you are taking: ");
		for (int i = 0; i < listOfStudents.get(index).getCourseList().size(); i++) {

			System.out.println(listOfStudents.get(index).getCourseList().get(i).toString());
		}

		// Get user input.
		System.out.print(
				"Enter the number of the class you would like to delete from this list: (The first course is 0, not 1)");
		int choice = in.nextInt();

		listOfStudents.get(index).getCourseList().remove(choice);
	}

	public void deleteClassFacultyMember() {

		// Create a new scanner.
		Scanner in = new Scanner(System.in);

		// Get faculty member's ID.
		System.out.println("What is your employee ID number? ");
		int employeeID = in.nextInt();
		int index = 0;

		// Use linear search to find the faculty member.
		for (int i = 0; i < listOfFacultyMembers.size(); i++) {

			if (employeeID == listOfFacultyMembers.get(i).getEmployeeID()) {

				index = i;
			}
		}

		// Display the faculty member's current classes.
		for (int i = 0; i < listOfFacultyMembers.get(index).getTeachingSchedule().size(); i++) {

			System.out.println(listOfFacultyMembers.get(index).getTeachingSchedule().get(i).toString());
		}

		// Get user input.
		System.out.print(
				"Enter the number of the class you would like to delete from this list: (The first class is 0, not 1)");
		int choice = in.nextInt();

		listOfFacultyMembers.get(index).getTeachingSchedule().remove(choice);
	}

}