/*
 * Ares Ton-That
 * This class is designed to model the breed Dachsund.
 */

public class Dachsund implements Dog {

	// Create data fields name and weight.
	private String name;
	private double weight;

	// Create a constructor with data fields for Dachsund.
	public Dachsund(String name, double weight) {

		this.name = name;
		this.weight = weight;
	}

	// Override the getWeight, eat, bark, and attack methods from Dog.
	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public void eat(double amount) {

		weight += amount;

		System.out.println("umyumyum, " + name + " eats " + amount + " grams of kibbles.");
	}

	@Override
	public String bark() {

		return "yip yip yip";
	}

	@Override
	public void attack() {

		System.out.println(name + " barks until its victim's ear hurt.");
	}
	
	@Override
	public String toString() {
		
		return "This Dachsund is named " + name + " and weighs " + weight + " grams.";
	}
}