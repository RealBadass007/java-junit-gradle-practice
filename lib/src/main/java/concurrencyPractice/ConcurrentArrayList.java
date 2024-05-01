package concurrencyPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentArrayList {
	
	public static void main(String[] args) {
		
		List<Integer> normalList = new CopyOnWriteArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		
		Iterator<Integer> it = normalList.iterator();
		
		normalList.add(8);
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
