/*
 * Ares Ton-That
 * This program is designed to model a student.
 */

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

	// Create data fields cin and courseList
	private int cin;
	private List<Course> courseList = new ArrayList<Course>();

	// Create a constructor with data fields for the Student class.
	public Student(int streetNumber, String streetName, String city, String stateOrProvince, String country,
			String name, int cin) {

		// Invoke the parent class' constructor using super().
		super(streetNumber, streetName, city, stateOrProvince, country, name);
		this.cin = cin;
	}

	// Create getter and setter methods for the Student class.
	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	// Create the add and drop methods for the Student class.
	public void add(Course course) {

		courseList.add(course);
	}

	public void drop(Course course) {

		courseList.remove(course);
	}

	// Create the toString() method for student.
	public String toString() {

		return "This student's cin is " + cin + " and the courses they are taking are " + courseList.toString()
				+ " and " + super.toString();
	}

}