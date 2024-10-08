package week02.lab;

public class CodeToBeTested {

	final double PI = 3.0;
	double radius;

	public CodeToBeTested(double radius) {
		// does not check if radius is negative
		this.radius = radius;
	}

	public double area() {
		return PI * radius * radius;
	}

	public double circumference() {
		return 2 * PI * radius;
	}

}
