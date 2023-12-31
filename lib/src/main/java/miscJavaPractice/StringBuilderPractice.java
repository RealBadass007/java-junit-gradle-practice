package miscJavaPractice;

import java.util.Arrays;

public class StringBuilderPractice {

	public static void main(String[] args) {
		
		StringBuilder strBld = new StringBuilder("Chirag");
		
		strBld.append(" Bangera");
		
		System.out.println("strBld => " + strBld);
		
//		strBld.reverse();
//		
//		System.out.println("strBld => " + strBld);
//		
//		strBld.reverse();
		
		//To convert to string
		String str = strBld.toString();
		
		char[] charArr = new char[strBld.length()];
		
		strBld.getChars(0, 10, charArr, 0);
		
		System.out.println("charArr => " + Arrays.toString(charArr));
	}
	
}
