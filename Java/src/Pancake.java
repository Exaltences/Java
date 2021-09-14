
public class Pancake extends Portion {

	double radius;
	
	public Pancake(double radius) {

		super(radius * 10);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String toString() {

		return "Customer eats a pancake of radius " + radius;
	}

}