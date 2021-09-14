/*
 * Ares Ton-That
 * This class is designed to model a Faculty Member.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacultyMember extends Person {

	// Create data fields employeeID and teachingSchedule.
	private int employeeID;
	private List<Course> teachingSchedule = new ArrayList<Course>();

	// Create a constructor with data fields for FacultyMember.
	public FacultyMember(int streetNumber, String streetName, String city, String stateOrProvince, String country,
			String name, int employeeID) {

		// Invoke the constructor from the person class using super().
		super(streetNumber, streetName, city, stateOrProvince, country, name);
		this.employeeID = employeeID;
	}

	// Create getter and setter methods for employee ID and teaching schedule.
	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public List<Course> getTeachingSchedule() {
		return teachingSchedule;
	}

	public void setTeachingSchedule(List<Course> teachingSchedule) {
		this.teachingSchedule = teachingSchedule;
	}

	// Create the teach and drop methods for the faculty member.
	public void teach(Course course) {

		teachingSchedule.add(course);
	}

	public void drop(Course course) {

		Scanner in = new Scanner(System.in);

		System.out.println("Here is your current schedule: ");
		for (int i = 0; i < teachingSchedule.size(); i++) {

			System.out.println(teachingSchedule.get(i).toString());
		}

		System.out.print("Enter the number of the course you would like to remove (The first course is 0, not 1): ");
		int courseNumber = in.nextInt();

		teachingSchedule.remove(courseNumber);
	}

	// Create a toString() method for the Faculty Member class.
	public String toString() {

		return "This faculty member's ID number is " + employeeID + " and the courses they are teaching are "
				+ teachingSchedule.toString() + " and " + super.toString();
	}

}