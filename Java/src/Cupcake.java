
public class Cupcake extends Portion {

	double radius;
	double height;
	double volume;

	public Cupcake(double radius, double height) {

		super(4 * Math.pow(radius, 2) * height);

		volume = 4 * Math.pow(radius, 2) * height;
		this.radius = radius;
		this.height = height;
	}
		

	public String toString() {

		return "Customer eats a cupcake with volume " + volume;
	}
}