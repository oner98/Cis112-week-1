package hblib.io.svg;

public class SVGShape {

	String colorFill = SVGLib.COLOR_CONIFER;
	String colorStroke = SVGLib.COLOR_BLACK;
	int strokeWidth = 1;

	public SVGShape() {
		// no arg constructor
	}

	String getStroke() {
		String s = SVGLib.SVG_STYLE_STROKE_WIDTH_1;
		s += this.strokeWidth;
		s += SVGLib.SVG_STYLE_STROKE_WIDTH_2;
		return s;
	}

	/**
	 * Style info
	 * 
	 * @return
	 */
	public String draw() {
		StringBuilder sb = new StringBuilder("");
		sb.append("\n\tstyle=\"" + this.getStroke() + "\"");
		sb.append("\n\tfill=\"" + this.colorFill + "\" ");
		sb.append("\n\tstroke=\"" + this.colorStroke + "\" ");
		return sb.toString();
	}

	public String getColorFill() {
		return colorFill;
	}

	public void setColorFill(String color) {
		this.colorFill = color;
	}

	public String getColorStroke() {
		return colorStroke;
	}

	public void setColorStroke(String color) {
		this.colorStroke = color;
	}

	public int getStrokeWidth() {
		return strokeWidth;
	}

	public void setStrokeWidth(int styleStrokeWidth) {
		this.strokeWidth = styleStrokeWidth;
	}

	@Override
	public String toString() {
		return "[SVGShape: colorFill=" + colorFill//
				+ ", colorStroke=" + colorStroke//
				+ ", strokeWidth=" + strokeWidth + "]";
	}

}
