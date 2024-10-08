package hblib.io.file;

import java.io.File;

public class LibIOFile_Test {

	static String path = "src" //
			+ File.separator + "hblib" //
			+ File.separator + "io" //
			+ File.separator + "file";
	static String fileName = "test3.txt";

	public static void main(String[] args) {

		String strRead;
		String pathToFile;

		// name of file to read
		pathToFile = path;
		System.out.println("pathToFile: " + pathToFile);
		// new line
		LibIOFile.fileWriteNew(pathToFile, fileName, "This is the first line,");
		strRead = LibIOFile.fileRead(pathToFile, fileName);
		System.out.println("strFile-A:");
		System.out.println(strRead);
		// append
		LibIOFile.fileWriteAppend(pathToFile, fileName, "\nThis is the second.");
		strRead = LibIOFile.fileRead(pathToFile, fileName);
		System.out.println("strFile-B:");
		System.out.println(strRead);
		// overwrite existence file
		LibIOFile.fileWriteNew(pathToFile, fileName, "Old file is overwritten.");
		strRead = LibIOFile.fileRead(pathToFile, fileName);
		System.out.println("strFile-A:");
		System.out.println(strRead);

	}

}
