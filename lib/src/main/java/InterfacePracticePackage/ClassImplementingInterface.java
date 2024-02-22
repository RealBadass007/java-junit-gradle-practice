package InterfacePracticePackage;

public class ClassImplementingInterface implements InterfacePractice {

	@Override
	public void interfaceMethod() {
		// TODO Auto-generated method stub
		
	}

	//Cannot override default interface methods because default methods are only allowed inside interfaces
	//This won't compile
//	public default void interfaceDefaultMethod() {
//		System.out.println("Interface Default Method here!");
//	}
	
	
	public static void main(String[] args) {
		
		System.out.println("InterfacePractice.interfaceVar => " + InterfacePractice.interfaceVar);
		System.out.println("InterfacePractice.interfaceVarDeclaredFinal => " + InterfacePractice.interfaceVarDeclaredFinal);
		
		//inherits variable from interface
		ClassImplementingInterface classObj = new ClassImplementingInterface();
		System.out.println("classObj.interfaceVarDeclaredFinal => " + classObj.interfaceVarDeclaredFinal);
		
		System.out.println();
		InterfacePractice.interfaceStaticMethod();
		
		//This won't compile!
//		InterfacePractice.interfaceDefaultMethod();
		
		//Need to access default methods via a child object!
		classObj.interfaceDefaultMethod();
		System.out.println();
		
		
		
		
	}

}
