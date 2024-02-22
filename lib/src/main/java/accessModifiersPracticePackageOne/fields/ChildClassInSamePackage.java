package accessModifiersPracticePackageOne.fields;

public class ChildClassInSamePackage extends ParentClass {

public void printParentClassFields() {
		
		System.out.println("In ChildClassInSamePackage method. Accessing publicField => " + publicField);
		System.out.println("In ChildClassInSamePackage method. Accessing protectedField => " + protectedField);
		System.out.println("In ChildClassInSamePackage method. Accessing defaultField => " + defaultField);
		
		//Throws compilation error
//		System.out.println("In ChildClassInSamePackage method. Accessing privateField => " + privateField);
		
	}
	
}
