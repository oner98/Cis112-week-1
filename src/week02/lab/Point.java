package week02.lab;

import hblib.utility.LibNumber;

/**
 * Point in 2D
 * 
 * @author bingol
 *
 */
public class Point {

	double x;
	double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double distance(Point pX) {
		double x2 = (this.x - pX.x) * (this.x - pX.x);
		double y2 = (this.y - pX.y) * (this.y - pX.y);
		return Math.sqrt(x2 + y2);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null) {
			return false;
		}
		if (getClass() != o.getClass()) {
			return false;
		}
		Point p = (Point) o;
		return LibNumber.doubleEquals(x, p.x)//
				&& LibNumber.doubleEquals(y, p.y);
	}

	@Override
	public String toString() {
		return "[Point: x=" + x + ", y=" + y + "]";
	}

}
