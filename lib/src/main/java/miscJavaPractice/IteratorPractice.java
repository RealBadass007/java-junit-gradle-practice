package miscJavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class IteratorPractice {
	
	public static void main(String[] args) {
		
		List<Integer> listOfInt = new ArrayList<>(Arrays.asList(6,3,9,2,8,1));
		
		Iterator<Integer> it = listOfInt.iterator();
		
		while(it.hasNext()) {
//			System.out.println("it.next() => " + it.next());
			
			Integer num = it.next();
			
			System.out.println("num => " + num);
			
			it.remove();
		}
		
		System.out.println("listOfInt => " + listOfInt);
		
		
		
		
		HashMap<Integer, String> mapOfIntStr = new HashMap<>();
		
		mapOfIntStr.put(1, "Chirag");
		mapOfIntStr.put(2, "Purshottam");
		mapOfIntStr.put(3, "Suma");
		
		Set<Integer> mapKeySet = mapOfIntStr.keySet();
		Collection<String> listOfValues =  mapOfIntStr.values();
		Set<Entry<Integer, String>> mapEntrySet = mapOfIntStr.entrySet();
		
		System.out.println("mapKeySet => " + mapKeySet);
		System.out.println("listOfValues => " + listOfValues);
		System.out.println("mapEntrySet => " + mapEntrySet);
		
		Iterator<Entry<Integer, String>> mapIt = mapOfIntStr.entrySet().iterator();
		
		while(mapIt.hasNext()) {
//			System.out.println("mapIt.next() => " + mapIt.next());
			
			Entry<Integer, String> entrySet = mapIt.next();
			
			System.out.println("entrySet => " + entrySet);
			
			System.out.println("entrySet.getKey() => " + entrySet.getKey());
			
			System.out.println("entrySet.getValue() => " + entrySet.getValue());

//			mapIt.remove();
		}
		
		System.out.println("mapOfIntStr => " + mapOfIntStr);
		
	}

}
