package sortingAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class QuickSortPractice {

	public static void main(String[] args) {
		
		List<Integer> numsList = new Random().ints(5, 0, 200).boxed().collect(Collectors.toList());
		
		System.out.println("numsList => " + numsList);
		
		List<Integer> mySortedNumsList = quickSort(numsList);
		
//		System.out.println("original numsList NEED TO CHECK THIS LATER => " + numsList);
		System.out.println("sorted numsList => " + mySortedNumsList);
		System.out.println();
		System.out.println();
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

	public static List<Integer> quickSort(List<Integer> numsList) {
		
		List<Integer> copyOfNumsList = new ArrayList<>(numsList);
		
		quickSortHelper(copyOfNumsList, 0, copyOfNumsList.size() - 1);
		
		return copyOfNumsList;
		
	}

	private static void quickSortHelper(List<Integer> numsList, int startIdx, int endIdx) {
		if(startIdx < endIdx) {
			int partitionIndex = partition(numsList, startIdx, endIdx);
			
			quickSortHelper(numsList, startIdx, partitionIndex - 1);
			quickSortHelper(numsList, partitionIndex + 1,endIdx);
			
		}
	}

	private static int partition(List<Integer> numsList, int startIdx, int endIdx) {
		
		int pivotElement = numsList.get(endIdx);
		int i = startIdx - 1;
		
		for (int j = startIdx; j < endIdx; j++) {
			
			if(numsList.get(j) <= pivotElement) {
				i++;
				
				int tempSwapElement = numsList.get(i);
				numsList.set(i, numsList.get(j));
				numsList.set(j, tempSwapElement);
				
			}
		}
		
		i++;	
		
		int tempSwapElement = numsList.get(i);
		numsList.set(i, pivotElement);
		numsList.set(endIdx, tempSwapElement);
		
		return i;
	}
	
}
