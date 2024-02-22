package mathPracticePackage;

public class MathClass {
	
	public static void main(String[] args) {
		
		int x = 5;
		
		System.out.println("x => " + x + " of type => " + ((Object)x).getClass().getName());
		
		double y = x * 1.0;
		
		System.out.println("y = x * 1.0 => " + y + " of type => " + ((Object)y).getClass().getName());
		
		//will give compile time error:
//		float z = x * 1.0;
		
		//Adding f or F resolves this error
		float z = x * 1.0F;
		
		System.out.println("z = x * 1.0f => " + z + " of type => " + ((Object)z).getClass().getName());
		
		double m = x / 2.0;
		
		System.out.println("m = x / 2.0 => " + m + " of type => " + ((Object)m).getClass().getName());
		
		int n = x / 2;
		
		System.out.println("n = x / 2 => " + n + " of type => " + ((Object)n).getClass().getName());
	}

}
