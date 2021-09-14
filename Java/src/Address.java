/*
 * Ares Ton-That
 * This class is designed to model an address.
 */

public class Address {

	// Create data fields streetNumber, streetName, city, stateOrProvince, and
	// country
	private int streetNumber;
	private String streetName;
	private String city;
	private String stateOrProvince;
	private String country;

	// Create a constructor with data fields for the Address class.
	public Address(int streetNumber, String streetName, String city, String stateOrProvince, String country) {

		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.stateOrProvince = stateOrProvince;
		this.country = country;
	}

	// Create getter and setter methods for the Address Class.
	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStateOrProvince() {
		return stateOrProvince;
	}

	public void setStateOrProvince(String stateOrProvince) {
		this.stateOrProvince = stateOrProvince;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// Create a toString() method that returns the address of the person.
	public String toString() {

		return "The address of this person is: " + streetNumber + " " + streetName + " " + city + ", " + stateOrProvince
				+ ", " + country;
	}
}