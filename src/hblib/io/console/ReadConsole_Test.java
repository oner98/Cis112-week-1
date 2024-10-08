package hblib.io.console;

public class ReadConsole_Test {

//	public static void main(String[] args) {
//
//		System.out.println("enter an int:");
//
//		String str = ReadConsole.readConsole();
//		int a = Integer.parseInt(str);
//		System.out.println("a:" + a + " a+1:" + (a + 1));
//	}
	
	public static void main(String[] args) {
		String s;
		
//		//
//		System.out.println("Enter a string such as 'father':");
//		s = ReadConsole.readConsole();
//		System.out.println("you entered: " + s);
//		System.out.println();
		
		//
		System.out.println("Enter a string which is an integer such as '12':");
		s = ReadConsole.readConsole();
		int a = Integer.parseInt(s);
//		System.out.println("a:" + a + " a+1:" + (a + 1));
		System.out.println("you entered: " + a);
		System.out.println();
		
//		// use scanner
//		ReadConsole.useScanner();

	}


}
