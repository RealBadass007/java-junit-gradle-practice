package lambdaPracticePackage;

public class classWithLambda {

	public static void main(String[] args) {
		
		//Instead of creating a concrete class which implements the IMyPrintable interface, and then defining the method implementation
		//of myAbstractPrintMethod method in that class, we can do it here itself using a lambda expression
		IMyPrintable printableInterfaceObjectReference = () -> System.out.println("Function implementation using a lamda expression");
		
		printableInterfaceObjectReference.myAbstractPrintMethod();
		
		//Interface static method
		IMyPrintable.myAbstractPrintMethodTwo();
		
		//Interface default method
		printableInterfaceObjectReference.myAbstractPrintMethodThree();
	}
	
}
