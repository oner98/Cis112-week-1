package hblib.io.svg;

import hblib.io.file.LibIOFile;

/**
 * Simple SVG lib
 * 
 * @see https://en.wikipedia.org/wiki/SVG
 * @see https://developer.mozilla.org/en-US/docs/Web/SVG
 * 
 * @author bingol
 *
 */
public class SVGLib {

	public static final int WIDTH = 600;
	public static final int HEIGHT = 300;
	//
	public static final String HTML_BEGIN_TITLE = "<!DOCTYPE html>\n" //
			+ "<html lang=\"en\">\n" //
			+ "    <head>\n" //
			+ "        <meta charset=\"UTF-8\" />\n" //
			+ "        <title>";
	public static final String HTML_TITLE_H1 = "" //
			+ "</title>\n" //
			+ "    </head>\n" //
			+ "    <body>\n" //
			+ "        <h1>";
	public static final String HTML_H1_ = "" //
			+ "</h1>\n";
	public static final String HTML_END = "</body>\n" //
			+ "</html>";
	//
	public static final String SVG_BEGIN = "\n<svg " //
			+ "id=\"id_svg\" " //
			+ "xmlns=\"http://www.w3.org/2000/svg\" " //
			+ "width=\"600\" height=\"300\" " //
			+ "viewBox=\"0 0 600 300\">";
	public static final String SVG_END = "\n</svg>\n\n";

	/**
	 * Set viewBox
	 * 
	 * @param paper
	 * @return
	 */
	public static String svgBegin(Paper paper) {
		String s = "";
		s = "\n<svg " //
				+ "id=\"id_svg\" " //
				+ "xmlns=\"http://www.w3.org/2000/svg\" " //
				+ "width=\"600\" height=\"300\" " //
				+ "viewBox=\"" + paper.getxUL()//
				+ " " + paper.getyUL()//
				+ " " + paper.getWidth()//
				+ " " + paper.getHeight()//
				+ " " + "\">";
		return s;
	}

	/**
	 * Creates HTML file with given SVG.
	 * 
	 * @param pathToDirectory path to directory without fileSeparator at the end
	 * @param paper           Paper.
	 * @param s               SVG definition.
	 */
	public static void writeToFileHTML(String pathToDirectory, String fileName//
			, Paper paper, String s) {
		String strHtml = SVGLib.HTML_BEGIN_TITLE //
				+ fileName //
				+ HTML_TITLE_H1 //
				+ fileName //
				+ HTML_H1_ //
				+ SVGLib.svgBegin(paper) //
				+ s //
				+ SVGLib.SVG_END + SVGLib.HTML_END;
		LibIOFile.fileWriteNew(pathToDirectory, fileName + ".html", strHtml);
	}

	//
	public static final String SVG_STYLE_STROKE_WIDTH_1 = "stroke-width: ";
	public static final String SVG_STYLE_STROKE_WIDTH_2 = "px;";

	// colors
	// see: https://www.w3.org/wiki/CSS/Properties/color/keywords
	public static final String COLOR_BLACK = "#000000";
	public static final String COLOR_RED = "#ff0000";
	public static final String COLOR_GREEN = "#00ff00";
	public static final String COLOR_BLUE = "#0000ff";
	public static final String COLOR_WHITE = "#ffffff";
	public static final String COLOR_AQUA = "#00ffff";
	public static final String COLOR_SILVER = "#c0c0c0";
	public static final String COLOR_CONIFER = "#bada55";

}
