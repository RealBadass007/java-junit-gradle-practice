package InheritencePracticePackage;

import java.util.ArrayList;
import java.util.List;

public class ChildClass extends ParentClass{

	int id;
	int name;
	
	int someVariable = 10;
	
	ChildClass() {
		//super() is the first thing which implicitly gets called after entering every constructor.
		//If the parent class does not have a constructor with zero arguments, every constructor will throw a compilation error.
		//To test this, comment out Parent() constructor in ParentClass class
		System.out.println("Inside ChildClass no param constructor");
	}
	
	ChildClass(int id) {
		//super() is the first thing which implicitly gets called after entering every constructor.
		//If the parent class does not have a constructor with zero arguments, every constructor will throw a compilation error.
		//To test this, comment out Parent() constructor in ParentClass class
		System.out.println("Inside ChildClass one param constructor (id) => " + id);
	}
	
	public static void main(String[] args) {
		
		ChildClass childObj = new ChildClass(1);
		
		System.out.println("\nParent obj:");
		ParentClass parentObj = new ParentClass(1);
		
		System.out.println("\nSome important things to remember:\n");
		
		System.out.println("Variables in Java do not follow Polymorphism and Overriding. Variables are resolved at compile time. Not run time!");
		System.out.println("parentObj.someVariable => " + parentObj.someVariable);
		System.out.println("childObj.someVariable =>  " + childObj.someVariable);
		
		System.out.println("Child variable hides parent variable with same name. This is called Variable Hiding");
	}
	
	//Since the return type of getName() method in Parent class is String, the return type of the same method with same arguments
	//has to be same OR!!!
	//It can be a subtype of the parent class method. This is called covariant return type
	
//	public int getName() {
//		return 2;
//	}
	
	public ArrayList<Integer> covarientInheritence() {
		return null;
	}
	
}
