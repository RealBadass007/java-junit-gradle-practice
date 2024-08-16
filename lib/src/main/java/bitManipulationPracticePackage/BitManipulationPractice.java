package bitManipulationPracticePackage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BitManipulationPractice {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<>(Arrays.asList(4,8,3,2,4,3,2));	// every element twice except one
//		List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,5,1,2,3,5));	// every element thrice except one
		
//		List<Integer> arr = new ArrayList<>(Arrays.asList(4,1,4,4));
		
		int ans = 0;
		
		for(int i = 0; i < arr.size(); i++) {
//			System.out.println("element binary => " + Integer.toBinaryString(arr.get(i)));
			ans = ans ^ arr.get(i);
//			System.out.println(" => " + ans);
//			System.out.println("ans binary => " + Integer.toBinaryString(ans));
		}
		
		System.out.println(ans);
		
		
		////////////////////////////
		////////////////////////////
		////////////////////////////
		
		System.out.println();
		
		int n = -11;
		
		String str = new StringBuilder(Integer.toBinaryString(n)).reverse().toString();
		
//		if(n < 0) {
//            str = "-" + str;
//        }
		
//		String str = "-10101010101010101010101010101010";
		
		System.out.println(Integer.parseUnsignedInt(str, 2));
		
	}
	
}
