package accessModifiersPracticePackageTwo.fields;

import accessModifiersPracticePackageOne.fields.*;

public class MainClassInDifferentPackage {

	public static void main(String[] args) {
		
		new ParentClass().printFields();
		
		ParentClass parentClassObj = new ParentClass();
		
		System.out.println();
		System.out.println("In MainClassInDifferentPackage method. Accessing publicField via instance => " + parentClassObj.publicField);
		
		//Throws compile-time error
//		System.out.println("In MainClassInDifferentPackage method. Accessing protectedField via instance => " + parentClassObj.protectedField);
		
		//Throws compile-time error
//		System.out.println("In MainClassInDifferentPackage method. Accessing defaultField via instance => " + parentClassObj.defaultField);
		
		//Throws compile-time error
//		System.out.println("In MainClassInDifferentPackage method. Accessing privateField via instance => " + parentClassObj.privateField);
		
		
		
		ChildClassInDifferentPackage childClassObj = new ChildClassInDifferentPackage();
		System.out.println();
		System.out.println("In ChildClassInDifferentPackage method. Accessing publicField via child instance => " + childClassObj.publicField);
		
		//Throws compile-time error
//		System.out.println("In ChildClassInDifferentPackage method. Accessing protectedField via child instance => " + childClassObj.protectedField);
		
		//Throws compile-time error
//		System.out.println("In ChildClassInDifferentPackage method. Accessing defaultField via child instance => " + childClassObj.defaultField);
		
		//Throws compile-time error
//		System.out.println("In MainClassInDifferentPackage method. Accessing privateField via instance => " + parentClassObj.privateField);
		
	}
	
}
