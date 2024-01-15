package prefixAndPostfixIncrementsPackage;

public class PrefixAndPostfix {

	public static void main(String[] args) {
		
		int x = 10;
		
		System.out.println("x => " + x); 	//10
		System.out.println("x => " + ++x);	//11
		System.out.println("x => " + x++);	//11
		System.out.println("x => " + x);	//12
		
		System.out.println();
		
		int y = 1;
		int z = 1;
		
		System.out.println("y => " + y);	//1
		System.out.println("z => " + z);	//1
		System.out.println("y++ + z => " + (y++ + z));	//2
		System.out.println("y => " + y);	//2
		System.out.println("z => " + z);	//1
	}
	
}
