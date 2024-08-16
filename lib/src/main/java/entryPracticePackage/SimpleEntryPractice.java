package entryPracticePackage;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleEntryPractice {

	public static void main(String[] args) {
		
		SimpleEntry<Double, Integer> pair = new SimpleEntry<>(1.0, 1);
		
		SimpleEntry<Double, Integer>[] abc = new SimpleEntry[5];
		
		abc[0] = new SimpleEntry<>(1.0, 1);
		abc[1] = new SimpleEntry<>(2.0, 2);
		abc[2] = new SimpleEntry<>(3.0, 3);
		
		for(int i = 0; i < abc.length; i++) {
			if(abc[i] != null) {
				System.out.println(abc[i].getKey()+ " " + abc[i].getValue());
			}
		}
		
//		ArrayList<Double>[] list = new ArrayList[5];
//		
//		list[0] = new ArrayList<>(Arrays.asList(1.0));
//		list[1] = new ArrayList<>(Arrays.asList(1.0));
//		list[2] = new ArrayList<>(Arrays.asList(1.0));
//		
//		for(int i = 0; i < list.length; i++) {
//			if(list[i] != null) {
//				double num = list[i].get(0);
//				System.out.println(num);
//			}
//		}
		
	}
	
}
