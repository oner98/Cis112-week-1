package hblib.utility;

public class LibNumber {
	
	static final double EPSILON = 1e-15;

	public static boolean doubleEquals(double a, double b) {
		return doubleEquals(a, b, EPSILON);
	}

	public static boolean doubleEquals(double a, double b, double epsilon) {
		if (a == Double.NaN || b == Double.NaN) {
			return false;
		}
		return Math.abs(a - b) < epsilon;
	}
	
}
