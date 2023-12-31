package miscJavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

public class SortingCollectionsPractice {

	public static void main(String[] args) {
		
		List<Integer> listOfInt = new ArrayList<>(Arrays.asList(6,3,9,2,8,1));
		
		Collections.sort(listOfInt);
		
		System.out.println("Sorted => " + listOfInt);
		
		Collections.sort(listOfInt, Collections.reverseOrder());
		
		System.out.println("Sorted Reverse order => " + listOfInt);
		
		//////////
		
		List<String> listOfStr = new ArrayList<>(Arrays.asList("6","3","9","2","8","1"));
		
		Collections.sort(listOfStr);

		System.out.println("Sorted => " + listOfStr);
		
		//////////
		
		
		HashMap<String, String> mapOfStr = new HashMap<>();
		
		mapOfStr.put("Chirag", "Son");
		mapOfStr.put("Suma", "Mother");
		mapOfStr.put("Purshottam", "Father");
		
		
		System.out.println("HashMap => " + mapOfStr);
		
		TreeMap<String, String> treeMapOfStr = new TreeMap<>();
		
		treeMapOfStr.putAll(mapOfStr);
		
		System.out.println("Automatically Sorted (According to Key) TreeMap => " + treeMapOfStr);
		
	}
	
}
