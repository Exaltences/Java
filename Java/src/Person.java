/*
 * Ares Ton-That
 * This program is designed to model a person.
 */

public class Person extends Address {

	// Create data field name for the Person class
	private String name;

	// Create a constructor with data fields for the Person class.
	public Person(int streetNumber, String streetName, String city, String stateOrProvince, String country,
			String name) {

		// Invoke the constructor from the address class by calling super()
		super(streetNumber, streetName, city, stateOrProvince, country);
		this.name = name;
	}

	// Create getter and setter methods for the data field name.
	public String getName() {
		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	// Create a toString() method for the person class.
	public String toString() {

		return "The name of this person is " + name + " and " + super.toString();
	}

}