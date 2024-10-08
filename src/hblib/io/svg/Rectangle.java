package hblib.io.svg;

public class Rectangle extends SVGShape {
	/**
	 * x of upper left corner
	 */
	int x;
	/**
	 * y of upper left corner
	 */
	int y;
	/**
	 * width
	 */
	int width;
	/**
	 * height
	 */
	int height;

	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public String draw() {
		StringBuilder sb = new StringBuilder("");
		sb.append("\n");
		sb.append("<rect ");
		sb.append("\n\tx=\"" + this.x + "\"");
		sb.append("\n\ty=\"" + this.y + "\"");
		sb.append("\n\twidth=\"" + this.width + "\"");
		sb.append("\n\theight=\"" + this.height + "\"");
		sb.append(super.draw());
		sb.append("\n></rect>");
		return sb.toString();
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "[Rectangle: x=" + x + ", y=" + y + "//" + ", width=" + width + ", height=" + height//
				+ ", colorFill=" + colorFill + ", colorStroke=" + colorStroke//
				+ ", strokeWidth=" + strokeWidth + "]";
	}

}
// <rect x="120" width="100" height="100" rx="15" />
