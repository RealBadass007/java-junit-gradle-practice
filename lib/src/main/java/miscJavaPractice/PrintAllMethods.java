package miscJavaPractice;

import java.lang.reflect.Method;

public class PrintAllMethods {

	public static void main(String[] args) {
		
		Class clazz = null;
		
		try {
			
//			clazz = Class.forName("java.lang.String");
			
//			clazz = Class.forName("java.lang.StringBuilder");
			
			clazz = Class.forName("java.lang.Integer");
			
			Method[] methods = clazz.getMethods();
			
			for(Method method : methods) {
				
				System.out.println("Method : " + method	);
				
			}
			
		} catch(Exception e) {
			System.out.println("Inside Exception");
		}
		
	}
	
}
