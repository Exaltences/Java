/*
 * Ares Ton-That
 * This program is designed to model the breed Mastiff.
 */

public class Mastiff implements Dog {

	// Create data fields name and weight.
	private String name;
	private double weight;

	// Create a constructor with data fields for Mastiff.
	public Mastiff(String name, double weight) {

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
		System.out.println("arrarrarrcrunch, " + name + " eats " + amount + " grams of your leg.");
	}

	@Override
	public String bark() {

		return "woof woof woof";
	}

	@Override
	public void attack() {

		System.out.println(name + " rips its victim to shreds with its massive jaws.");

		weight += 100;
	}
	
	@Override
	public String toString() {
		
		return "This Mastiff is named " + name + " and weighs " + weight + " grams.";
	}
}