package accessModifiersPracticePackageOne.fields;

public class MainClassInSamePackage {

	public static void main(String[] args) {
		
		System.out.println("Parent Class printFields method:");
		new ParentClass().printFields();
		
		ParentClass parentClassObj = new ParentClass();
		
		System.out.println();
		System.out.println("In MainClassInSamePackage method. Accessing publicField via instance => " + parentClassObj.publicField);
		System.out.println("In MainClassInSamePackage method. Accessing protectedField via instance => " + parentClassObj.protectedField);
		System.out.println("In MainClassInSamePackage method. Accessing defaultField via instance => " + parentClassObj.defaultField);
		
		//Throws compile-time error
//		System.out.println("In MainClassInSamePackage method. Accessing privateField via instance => " + parentClassObj.privateField);
		System.out.println();
		
		
		
		

		
		System.out.println("Child Class printFields method:");
		new ChildClassInSamePackage().printFields();
		
		System.out.println();
		
		System.out.println("Child Class printParentClassFields method:");
		new ChildClassInSamePackage().printParentClassFields();
		
		System.out.println();
		
		ChildClassInSamePackage childClassObj = new ChildClassInSamePackage();
		System.out.println();
		System.out.println("In MainClassInSamePackage method. Accessing publicField via child instance => " + childClassObj.publicField);
		System.out.println("In MainClassInSamePackage method. Accessing protectedField via child instance => " + childClassObj.protectedField);
		System.out.println("In MainClassInSamePackage method. Accessing defaultField via child instance => " + childClassObj.defaultField);
		
		//Throws compile-time error
//		System.out.println("In MainClassInSamePackage method. Accessing privateField via instance => " + parentClassObj.privateField);
		
	}
	
}
