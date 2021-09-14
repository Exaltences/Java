/*
 * Ares Ton-That
 * This program is designed to model a course.
 */

public class Course {

	// Create data fields course identifier and number of units.
	private String courseIdentifier;
	private int numberOfUnits;

	// Create a constructor for the course class.
	public Course(String courseIdentifier, int numberOfUnits) {

		this.courseIdentifier = courseIdentifier;
		this.numberOfUnits = numberOfUnits;
	}

	// Create getter and setter methods for the course identifier and the number
	// of units.
	public String getCourseIdentifier() {
		return courseIdentifier;
	}

	public void setCourseIdentifier(String courseIdentifier) {
		this.courseIdentifier = courseIdentifier;
	}

	public int getNumberOfUnits() {
		return numberOfUnits;
	}

	public void setNumberOfUnits(int numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}

	// Create a toString() method for the Course class.
	public String toString() {

		return courseIdentifier + " (" + numberOfUnits + " units)";
	}

}