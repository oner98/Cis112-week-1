package hblib.io.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadConsole {


	public static String readConsole() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		System.out.println("Enter a string such as 'mother':");
		String str = "";
		try {
			str = br.readLine();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}

	public static void useScanner() {
		Scanner in = new Scanner(System.in);

		// read a string
		System.out.println("Enter a string such as 'father':");
		String s = in.nextLine();
		System.out.println("You entered string: " + s);
		System.out.println();

		// read an integer
		System.out.println("Enter an integer such as '12'");
		int a = in.nextInt();
		System.out.println("You entered integer: " + a);
		System.out.println();

		// read a float
		System.out.println("Enter an float such as '12.3'");
		float b = in.nextFloat();
		System.out.println("You entered float: " + b);
		System.out.println();

		in.close();
	}

}
