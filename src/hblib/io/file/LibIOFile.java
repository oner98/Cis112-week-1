package hblib.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Simple file IO library.
 * 
 * @author bingol
 *
 */
public class LibIOFile {

	/**
	 * Reads the file into a String
	 * 
	 * @param pathToDirectory path to directory without fileSeparator at the end
	 * @param fileName   file name with extension
	 * @return
	 */
	public static String fileRead(String pathToDirectory, String fileName) {

		// create file object
		File file = null;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		String line = "";
		String strRead = "";
		try {
			file = new File(pathToDirectory + File.separator + fileName);
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
//				/**/System.out.println(line);
				strRead += line + "\n";
			}
		} catch (FileNotFoundException e) {
			System.out.println("Sorry, " + file.getName() + " not found.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return strRead;
	}

	/**
	 * Creates a new file and writes string into the file.
	 * 
	 * @param pathToDirectory path to directory without fileSeparator at the end
	 * @param fileName   file name with extension
	 * @param content
	 */
	public static void fileWriteNew(String pathToDirectory, String fileName, String content) {
		fileWrite(pathToDirectory, fileName, content, false);
	}

	/**
	 * Appends {@code strWrite} to already existing file.
	 * 
	 * @param pathToDirectory path to directory without fileSeparator at the end
	 * @param fileName   file name with extension
	 * @param content
	 */
	public static void fileWriteAppend(String pathToDirectory, String fileName, String content) {
		fileWrite(pathToDirectory, fileName, content, true);
	}

	/**
	 * Write string to the file.
	 * 
	 * @param pathToDirectory path to directory without fileSeparator at the end
	 * @param fileName   file name with extension
	 * @param content    to be written into file.
	 * @param append     creates file if false; appends if true.
	 */
	private static void fileWrite(String pathToDirectory, String fileName, String content, boolean append) {

		File file = new File(pathToDirectory + File.separator + fileName);
		FileWriter fileWriter = null;
		PrintWriter printWriter = null;

		try {
			fileWriter = new FileWriter(file, append);
			printWriter = new PrintWriter(fileWriter);
			printWriter.print(content);
			printWriter.flush();

		} catch (IOException e) {
			System.err.println("** WARNING **  " + "Make sure that the path \"" + pathToDirectory + "\" exists.");
			System.err.println("System terminates without creating the file.");
//			e.printStackTrace();
		} 
//		finally {
//			try {
//				fileWriter.close();
//				printWriter.close();
//			} catch (IOException e) {
//				// TODO what to do here
////				e.printStackTrace();
//			} catch (NullPointerException e2) {
//				// TODO: handle exception
//			}
//		}
	}

}
