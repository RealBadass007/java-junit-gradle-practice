package accessModifiersPracticePackageOne.methods;

public class ChildClassInSamePackage extends ParentClass {

public void printParentClassMethods() {
		
		
		System.out.println("In ChildClassInSamePackage method. Accessing publicMethod() :"); 
		publicMethod();
		
		System.out.println("In ChildClassInSamePackage method. Accessing protectedMethod() :");
		protectedMethod();
		
		System.out.println("In ChildClassInSamePackage method. Accessing defaultMethod() :");
		defaultMethod();
		
//		System.out.println("In MainClassInSamePackage method. Accessing privateMethod() :");
//		Throws compile-time error
//		privateMethod();
		
	}
	
}
