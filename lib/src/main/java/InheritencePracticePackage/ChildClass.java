package InheritencePracticePackage;

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
	
}
