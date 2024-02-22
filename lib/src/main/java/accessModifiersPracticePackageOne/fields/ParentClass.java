package accessModifiersPracticePackageOne.fields;

public class ParentClass {

	public String publicField = "Public Field";
	
	protected String protectedField = "Protected Field";
	
	String defaultField = "Default Field";
	
	private String privateField = "Private Field";
	
	public void printFields() {
		
		//can access every variable in this class
		
		System.out.println("In ParentClass method. Accessing publicField => " + publicField);
		System.out.println("In ParentClass method. Accessing protectedField => " + protectedField);
		System.out.println("In ParentClass method. Accessing defaultField => " + defaultField);
		System.out.println("In ParentClass method. Accessing privateField => " + privateField);
		
	}
}
