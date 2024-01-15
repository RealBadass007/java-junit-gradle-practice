package InheritencePracticePackage;

public class ParentClass {

	int id;
	String name;
	
	ParentClass() {
		System.out.println("Inside ParentClass no param constructor");
	}
	
	ParentClass(int id) {
		System.out.println("Inside ParentClass one param constructor (id) => " + id);
	}
	
	ParentClass(int id, String name) {
		System.out.println("Inside ParentClass two params constructor (id) => " + id + " name => " + name);
	}
	
}
