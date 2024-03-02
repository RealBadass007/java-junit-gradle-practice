package hashMapPracticePackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapPractice {

	public static void main(String[] args) {
		
		HashMap<String, String> mapOfStr = new HashMap<>();
		
		mapOfStr.put("Chirag", "Son");
		mapOfStr.put("Suma", "Mother");
		mapOfStr.put("Purshottam", "Father");
		
		Set<String> mapKeySet = mapOfStr.keySet();
		Collection<String> listOfValues =  mapOfStr.values();
		Set<Entry<String, String>> mapEntrySet = mapOfStr.entrySet();
		
		System.out.println("mapKeySet => " + mapKeySet);
		System.out.println("listOfValues => " + listOfValues);
		System.out.println("mapEntrySet => " + mapEntrySet);
		
		mapKeySet.stream().forEach(System.out::println);
		listOfValues.stream().forEach(System.out::println);

		for(Entry ent : mapEntrySet) {
			System.out.println("ent.getKey() => " + ent.getKey());
			System.out.println("ent.getValue() => " + ent.getValue());
		}
		
	}
	
}
