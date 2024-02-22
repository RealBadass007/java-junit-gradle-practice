package primitiveArrayPracticePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainPrimitiveArrayClass {

	public static void main(String[] args) {
		
		int    arr    []= {1,2,3,4,5};
		
		//Both are not correct ways
//		List<Integer> listInt = Arrays.asList(arr);
//		List<Integer> listInt = new ArrayList<Integer>(arr);
		
		//Correct method
		List<Integer> listInt = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		List<Integer> listInt2 = Arrays.asList(1,2,3,4,5);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(listInt);
		System.out.println(listInt2);
		
		int i = 5;
		int j = 10;
		
		for(i = 0; i < 15; i++, j++) {
		}
		
		System.out.println(i);
		System.out.println(j);
		
		
		List<Integer> listInt3 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		listInt3.add(2, 10);
		
		System.out.println(listInt3);
		
		int [][] arr2 = new int [5][];
		
		arr2 [0] = new int[2];
		
	}
	
}
