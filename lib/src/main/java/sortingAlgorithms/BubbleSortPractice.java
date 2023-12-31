package sortingAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class BubbleSortPractice {
	
	public static void main(String[] args) {
		
		List<Integer> numsList = new Random().ints(5, 0, 200).boxed().collect(Collectors.toList());
		
		System.out.println("numsList => " + numsList);
		
		List<Integer> mySortedNumsList = bubbleSort(numsList);
		
//		System.out.println("original numsList NEED TO CHECK THIS LATER => " + numsList);
		System.out.println("sorted numsList => " + mySortedNumsList);
		
		Collections.sort(numsList);
		
		if(mySortedNumsList.size() != numsList.size()) {
			System.out.println("List size is not consistent");
			return;
		}
		
		System.out.println("java sorted numsList => " + numsList);
		
		for(int i = 0; i < numsList.size(); i++) {
			if(!numsList.equals(mySortedNumsList)) {
				System.out.println("Error while sorting list");
				return;
			}
		}
		
		System.out.println("List sorted correctly");
		
	}

	public static List<Integer> bubbleSort(List<Integer> numsList) {

		List<Integer> copyOfNumsList = new ArrayList<Integer>(numsList);
		
		int temp;
		for(int i = 0; i < copyOfNumsList.size(); i++) {
			for(int j = 1; j < copyOfNumsList.size() - i ; j ++) {
				if(copyOfNumsList.get(j) < copyOfNumsList.get(j - 1)) {
					temp = copyOfNumsList.get(j);
					copyOfNumsList.set(j, copyOfNumsList.get(j - 1));
					copyOfNumsList.set(j-1, temp);
				}
			}
		}
		
		return copyOfNumsList;
	}

}
