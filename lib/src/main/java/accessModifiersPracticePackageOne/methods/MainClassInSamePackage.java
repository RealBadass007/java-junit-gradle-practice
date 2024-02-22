package accessModifiersPracticePackageOne.methods;

public class MainClassInSamePackage {

	public static void main(String[] args) {
		
		//SAME BEHAVIOURS AS FIELDS
		
		System.out.println("Parent Class printFields method:");
		new ParentClass().printMethods();
		
		ParentClass parentClassObj = new ParentClass();
		
		System.out.println();
		System.out.println("In MainClassInSamePackage method. Accessing publicMethod() via instance : "); 
		parentClassObj.publicMethod();
		
		System.out.println("In MainClassInSamePackage method. Accessing protectedMethod() via instance : ");
		parentClassObj.protectedMethod();
		
		System.out.println("In MainClassInSamePackage method. Accessing defaultMethod() via instance : ");
		parentClassObj.defaultMethod();
		
//		System.out.println("In MainClassInSamePackage method. Accessing privateMethod() via instance : ");
//		Throws compile-time error
//		parentClassObj.privateMethod();
		
		System.out.println();
		
		
		
		

		
		System.out.println("Child Class printMethods method:");
		new ChildClassInSamePackage().printMethods();
		
		System.out.println();
		
		System.out.println("Child Class printParentClassMethods method:");
		new ChildClassInSamePackage().printParentClassMethods();
		
		System.out.println();
		
		ChildClassInSamePackage childClassObj = new ChildClassInSamePackage();
		
		System.out.println("In MainClassInSamePackage method. Accessing publicMethod() via child instance : "); 
		childClassObj.publicMethod();
		
		System.out.println("In MainClassInSamePackage method. Accessing protectedMethod() via child instance : ");
		childClassObj.protectedMethod();
		
		System.out.println("In MainClassInSamePackage method. Accessing defaultMethod() via child instance : ");
		childClassObj.defaultMethod();
		
//		System.out.println("In MainClassInSamePackage method. Accessing privateMethod() via child instance : ");
//		Throws compile-time error
//		childClassObj.privateMethod();
		
	}
	
}
