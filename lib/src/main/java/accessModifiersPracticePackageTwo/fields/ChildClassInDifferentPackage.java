package accessModifiersPracticePackageTwo.fields;

import accessModifiersPracticePackageOne.fields.ChildClassInSamePackage;
import accessModifiersPracticePackageOne.fields.ParentClass;

public class ChildClassInDifferentPackage extends ParentClass {

public void printParentClassFields() {
		
		//can access every variable in this class
		
		System.out.println("In ChildClassInDifferentPackage method. Accessing publicField => " + publicField);
		System.out.println("In ChildClassInDifferentPackage method. Accessing protectedField => " + protectedField);
		
		//Throws compilation error
//		System.out.println("In ChildClassInDifferentPackage method. Accessing defaultField => " + defaultField);
		
		//Throws compilation error
//		System.out.println("In ChildClassInDifferentPackage method. Accessing privateField => " + privateField);
		
		
		
		//ALSO NOTE!! Accessing a protected field/method via instance is illegal in different package!
		//Will throw compiler error
//		System.out.println("In ChildClassInDifferentPackage method. Accessing new ChildClassInSamePackage().protectedField => " 
//		+ new ChildClassInSamePackage().protectedField);
		
	}
	
}
