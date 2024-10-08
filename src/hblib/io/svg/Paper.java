package hblib.io.svg;

import java.util.ArrayList;

/**
 * Simulates a paper to draw onto.
 * 
 * @author bingol
 *
 */
public class Paper {

	/**
	 * x coordinate of upper-left corner
	 */
	int xUL;
	/**
	 * y coordinate of upper-left corner
	 */
	int yUL;
	/**
	 * width of the paper
	 */
	int width;

	/**
	 * height of the paper
	 */
	int height;

	/**
	 * List of SVGShapes to be drawn on the paper
	 */
	ArrayList<SVGShape> drawable = new ArrayList<SVGShape>();

	public Paper(int xUL, int yUL, int width, int height) {
		this.xUL = xUL;
		this.yUL = yUL;
		this.width = width;
		this.height = height;
	}

	/**
	 * Add a SVGShape to be drawn
	 * 
	 * @param svg
	 */
	public void add(SVGShape svg) {
		drawable.add(svg);
	}

	/**
	 * Generate html file.
	 * 
	 * @param pathToDirectory full path of the html file.
	 * @param fileName        without `.html` extension.
	 */
	public void toHtml(String pathToDirectory, String fileName) {
		StringBuilder sb = new StringBuilder("");
		for (SVGShape svgShape : drawable) {
			sb.append(svgShape.draw());
		}
		SVGLib.writeToFileHTML(pathToDirectory, fileName, this, sb.toString());
		System.out.println("\n~~~~check \"" + pathToDirectory + fileName + ".html\"");
	}

	/**
	 * returns the x coordinate of upper-left corner
	 */
	public int getxUL() {
		return xUL;
	}

	/**
	 * returns the y coordinate of upper-left corner
	 */
	public int getyUL() {
		return yUL;
	}

	/**
	 * returns the width of the paper
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * returns the height of the paper
	 */
	public int getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "[Paper: xUL=" + xUL + ", yUL=" + yUL//
				+ ", width=" + width + ", height=" + height//
				+ ", drawable=" + drawable + "]";
	}

}
