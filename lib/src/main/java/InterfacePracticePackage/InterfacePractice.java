package InterfacePracticePackage;

public interface InterfacePractice {
	
	//every variable must be initialized in interface and it is implicitly "public static final"
	int interfaceVar = 1;
	
	//variable must be initialized or it will fail at compile time
	//this line won't let our code compile
//	int interfaceVarNotInitialized;			
	
	final int interfaceVarDeclaredFinal = 5;
	
	//the variable can't be initialized via a constructor either since interfaces can't have constructors
//	InterfacePractice(int interfaceVarNotInitialized) {
//		
//	}
	
	//if abstract/default/static is not specified, compiler assumes the method is abstract
	//All abstract, default, and static methods in an interface are implicitly public
	void interfaceMethod();
	
	//This will throw a compilation error in JAVA 8. But after JAVA 9 private modifier is allowed
//	private void interfacePrivateMethod();
	
	
	//Since Java 8, static method implementation is allowed inside interface 
	public static void interfaceStaticMethod() {
		System.out.println("Interface Static Method here!");
	}
	
	//Since Java 8, default method implementation is allowed inside interface 
	public default void interfaceDefaultMethod() {
		System.out.println("Interface Default Method here!");
	}
	
	
	
	
	//We can have more than one static or default methods!
	public static void interfaceStaticMethod2() {
		System.out.println("Interface Static Method 2 here!");
	}
	
	public default void interfaceDefaultMethod2() {
		System.out.println("Interface Default Method 2 here!");
	}
	public static void interfaceStaticMethod3() {
		System.out.println("Interface Static Method 3 here!");
	}
	
	public default void interfaceDefaultMethod3() {
		System.out.println("Interface Default Method 3 here!");
	}
	
}
