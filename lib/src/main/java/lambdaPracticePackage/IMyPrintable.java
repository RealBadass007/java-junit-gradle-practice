package lambdaPracticePackage;

//Functional Interfaces can only have one abstract method
//However they can have default or static methods

@FunctionalInterface
public interface IMyPrintable {

	void myAbstractPrintMethod();
	
	static void myAbstractPrintMethodTwo() {
		System.out.println("Hello I'm static method inside " + IMyPrintable.class);
	}
	
	default void myAbstractPrintMethodThree() {
		System.out.println("Hello I'm default method inside " + IMyPrintable.class);
	}
	
}
