package stringPracticePackage;

public class StringPracticeClass {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Hello3";
		
		//This is true because str1 and str2 point to the same STRING LITERAL
		//Java has a pool of unique 'interned' instances, and String literals are stored in this pool.
		//JVM checks to see if a similar string literal already exists in the String pool. 
		//If it does, the JVM returns a reference to the existing string literal.
		System.out.println(str1 == str2);
		
		System.out.println(str1.equals(str2));
		
		
		System.out.println();
		
		
		System.out.println("str1 == str2 => " + str1 == str2);		//result of this is false
		System.out.println("str1 == str2 => " + (str1 == str2));	//but this is true
		
		//Weird? Not really. Because the precedence of + operator is more than that of == operator. Higher/Larger precedence means higher priority
		//So when the expression "str1 == str2 => " + str1 == str2 is evaluated, the concatenation part is executed first.
		//Effectively the expression acts like: 
		//("str1 == str2 => " + str1) == str2
		//Instead of:
		//"str1 == str2 => " + (str1 == str2)
		
		
		System.out.println("str1 == str3 => " + (str1 == str3));
		
		System.out.println();
		
		//This is string literal. This is created by calling the intern() method on String.
		String str4 = "Hello";
		
		//This is string object. Both are different. In this method JVM is forced to create a new string reference,
		//even if “GeeksForGeeks” is in the reference String pool.
		String str5 = new String("Hello");
		
		//string object will always take more time to execute than string literal
		
		System.out.println("str4 == str5 => " + (str4 == str5));
		
		
	}
	
}
