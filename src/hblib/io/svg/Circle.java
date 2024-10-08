package hblib.io.svg;

/**
 * SVG Circle
 * 
 * @author bingol
 *
 */
public class Circle extends SVGShape {

	/**
	 * x of center
	 */
	int x;

	/**
	 * y of center
	 */
	int y;
	/**
	 * radius
	 */
	int r;

	public Circle(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}

	@Override
	public String draw() {
		String s = "\n";
		s += "<circle ";
		s += "\n\tcx=\"" + this.x + "\"";
		s += "\n\tcy=\"" + this.y + "\"";
		s += "\n\tr=\"" + this.r + "\"";
		//
		s += super.draw();
		//
		s += "\n></circle>";
		return s;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "[Circle: x=" + x + ", y=" + y + ", r=" + r//
				+ ", colorFill=" + colorFill//
				+ ", colorStroke=" + colorStroke//
				+ ", strokeWidth=" + strokeWidth + "]";
	}

}
