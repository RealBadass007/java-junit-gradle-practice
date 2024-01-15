package InheritencePracticePackage;

public class ChildClass extends ParentClass{

	ChildClass() {
		System.out.println("Inside ChildClass no param constructor");
	}
	
	ChildClass(int id) {
		System.out.println("Inside ChildClass one param constructor (id) => " + id);
	}
	
	public static void main(String[] args) {
		
		ChildClass childObj = new ChildClass(1);
		
		System.out.println("\nParent obj:");
		ParentClass parentObj = new ParentClass(1);
		
	}
	
}
