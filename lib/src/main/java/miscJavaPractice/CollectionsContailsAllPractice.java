package miscJavaPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsContailsAllPractice {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>(); 
		  
        // Use add() method to add elements 
        // into the List 
		list1.add("Welcome");
		list1.add("To");
		list1.add("My");
		list1.add("Practice");
		list1.add("Programs");
        
        List<String> list2 = new ArrayList<String>(); 
		  
        // Use add() method to add elements 
        // into the List 
        list2.add("Welcome");
        list2.add("To");
        list2.add("Practice");
        
        System.out.println("Are all elements in list2 present in list1 = > " + list1.containsAll(list2));
        
        
        Set<String> set = new HashSet<String>(); 
		  
        // Use add() method to add elements 
        // into the List 
        set.add("Welcome");
        set.add("To");
        set.add("Practice");
        
        System.out.println("Are all elements in set present in list1 = > " + list1.containsAll(set));
		
	}
	
}
