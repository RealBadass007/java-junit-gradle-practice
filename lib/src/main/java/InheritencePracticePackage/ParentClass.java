package InheritencePracticePackage;

import java.util.List;

public class ParentClass {

	int id;
	String name;
	
	int someVariable = 5;
	
	ParentClass() {
		System.out.println("Inside ParentClass no param constructor");
	}
	
	ParentClass(int id) {
		System.out.println("Inside ParentClass one param constructor (id) => " + id);
	}
	
	ParentClass(int id, String name) {
		System.out.println("Inside ParentClass two params constructor (id) => " + id + " name => " + name);
	}
	
	public String getName() {
		return "Name";
	}
	
	public List<Integer> covarientInheritence() {
		return null;
	}
	
}
