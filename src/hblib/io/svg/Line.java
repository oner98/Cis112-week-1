package hblib.io.svg;

/**
 * SVG line from point A to point B.
 * 
 * @author bingol
 *
 */
public class Line extends SVGShape {

	/**
	 * x of point A
	 */
	int x1;
	/**
	 * y of Point A
	 */
	int y1;
	/**
	 * x of point B
	 */
	int x2;
	/**
	 * y of point B
	 */
	int y2;

	/**
	 * Create line from point (x1, y1) to point (x2, y2).
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 */
	public Line(int x1, int y1, int x2, int y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	@Override
	public String draw() {
		StringBuilder sb = new StringBuilder("");
		sb.append("\n");
		sb.append("<line ");
		sb.append("\n\tx1=\"" + this.x1 + "\" ");
		sb.append("\n\ty1=\"" + this.y1 + "\" ");
		sb.append("\n\tx2=\"" + this.x2 + "\" ");
		sb.append("\n\ty2=\"" + this.y2 + "\" ");
		sb.append(super.draw());
		sb.append("\n></line>");
		return sb.toString();
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	@Override
	public String toString() {
		return "[Line: x1=" + x1 + ", y1=" + y1//
				+ ", x2=" + x2 + ", y2=" + y2//
				+ ", colorFill=" + colorFill//
				+ ", colorStroke=" + colorStroke//
				+ ", strokeWidth=" + strokeWidth + "]";
	}

}

// <line
// x1="0" x2="600" y1="0" y2="300"
// style="stroke-width: 3px; stroke-dasharray: 5px, 2px;"
// stroke="#0000ff">
// </line>
