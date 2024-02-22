package accessModifiersPracticePackageOne.methods;

public class ParentClass {

	public void publicMethod() { 
		System.out.println("Public method");
	};
	
	protected void protectedMethod() {
		System.out.println("Protected method");
	}
	
	void defaultMethod() {
		System.out.println("Default method");
	}
	
	private void privateMethod() {
		System.out.println("Private method");
	
	}
	
	public void printMethods() {
		
		//can access every method in this class
		
		System.out.println("In ParentClass method. Accessing publicMethod() : ");
		publicMethod();
		
		System.out.println("In ParentClass method. Accessing protectedMethod() : ");
		protectedMethod();
		
		System.out.println("In ParentClass method. Accessing defaultMethod() : ");
		defaultMethod();
		
		System.out.println("In ParentClass method. Accessing privateMethod() : ");
		privateMethod();
		
	}
}
