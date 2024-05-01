package immutableClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
			
		ClassWithFinalVariable obj = new ClassWithFinalVariable("Chirag", new ArrayList<>(Arrays.asList(1,2,3)));
		
//		obj.name = "Bangera";	//throws error
		
//		obj.listStr =  new ArrayList(Arrays.asList(1,2,3,4));	//throws error
		
		obj.listStr.add(4);		//doesn't throw error!!
		
	}
}
