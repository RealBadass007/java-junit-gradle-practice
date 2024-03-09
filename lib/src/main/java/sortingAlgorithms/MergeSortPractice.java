package sortingAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MergeSortPractice {

	public static void main(String[] args) {
		
		List<Integer> numsList = new Random().ints(5, 0, 200).boxed().collect(Collectors.toList());
		
		List<Integer> ogNumsList = new ArrayList<>(numsList);
		
		System.out.println("ogNumsList => " + ogNumsList);
		
		mergeSort(numsList);
		
//		System.out.println("original numsList NEED TO CHECK THIS LATER => " + numsList);
		System.out.println("sorted numsList => " + numsList);
		System.out.println();
		System.out.println();
		Collections.sort(ogNumsList);
		
		if(numsList.size() != ogNumsList.size()) {
			System.out.println("List size is not consistent");
			return;
		}
		
		System.out.println("java sorted numsList => " + ogNumsList);
		
		if(!numsList.equals(ogNumsList)) {
			System.out.println("Error while sorting list");
			return;
		}
		
		System.out.println("List sorted correctly");
		
	}

	static void mergeSort(List<Integer> numsList) {
		
		if(numsList.size() < 2) {
			return;
		}
		
		int mid = numsList.size() / 2;
		
		//List<Integer> leftArr  = numsList.subList(0, mid);				//.subList() method creates a view of the original list
		//List<Integer> rightArr  = numsList.subList(mid, numsList.size());	// and NOT an entirely new list
		
		List<Integer> leftArr  = new ArrayList<Integer>(numsList.subList(0, mid));
		mergeSort(leftArr);
		
		List<Integer> rightArr  = new ArrayList<Integer>(numsList.subList(mid, numsList.size()));
		mergeSort(rightArr);
		
		merge(numsList, leftArr, rightArr);

	}

	private static void merge(List<Integer> numsList, List<Integer> leftArr, List<Integer> rightArr) {
		
		int i = 0;
		int j = 0;
		
		int x = 0;
		
		// instead of creating a new arraylist, we'll just utilize the original sub-array 
		//which we cut in two halves
		
		while(i < leftArr.size() && j < rightArr.size()) {
			if(leftArr.get(i) <= rightArr.get(j)) {
				numsList.set(x++, leftArr.get(i++));
			} else {
				numsList.set(x++, rightArr.get(j++));
			}
		}
		
		while(i < leftArr.size()) {
			numsList.set(x++, leftArr.get(i++));
		}
		
		while(j < rightArr.size()) {
			numsList.set(x++, rightArr.get(j++));
		}
	}
	
	
	//OLDER VERSION

//	public static List<Integer> mergeSort(List<Integer> numsList) {
//
////		System.out.println();
////		System.out.println("Inside mergeSort numsList => " + numsList);
//		
//		List<Integer> copyOfNumsList = new ArrayList<>(numsList);
//		
//		return mergeSortHelper(copyOfNumsList);
//	}

//	private static List<Integer> mergeSortHelper(List<Integer> copyOfNumsList) {
//		
////		System.out.println();
////		System.out.println("Inside mergeSortHelper copyOfNumsList b4 => " + copyOfNumsList);
//		
//		if(copyOfNumsList.size() == 0 || copyOfNumsList.size() == 1) {
//			return copyOfNumsList;
//		}
//		
//		int mid = (copyOfNumsList.size() - 1) / 2;
//		
//		int leftSubArrEndIdx = mid;
//		int rightSubArrEndIdx = copyOfNumsList.size() - 1;
//		
//		List<Integer> leftSubArr = copyOfNumsList.subList(0, leftSubArrEndIdx + 1);
//		List<Integer> rightSubArr = copyOfNumsList.subList(leftSubArrEndIdx + 1, rightSubArrEndIdx + 1);
//		
//		List<Integer> leftSubArrSorted = mergeSortHelper(leftSubArr);
//		List<Integer> rightSubArrSorted = mergeSortHelper(rightSubArr);
//		
//		copyOfNumsList = merge(leftSubArrSorted, rightSubArrSorted);
//		
////		System.out.println();
////		System.out.println("Inside mergeSortHelper copyOfNumsList after => " + copyOfNumsList);
//		
//		return copyOfNumsList;
//	}

//	private static List<Integer> merge(List<Integer> leftSubArrSorted, List<Integer> rightSubArrSorted) {
//		
//		int i = 0;
//		int j = 0;
//		
//		List<Integer> sortedSubList = new ArrayList<>();
//		
//		while(i != leftSubArrSorted.size() && j != rightSubArrSorted.size()) {
//			
//			if(leftSubArrSorted.get(i) <= rightSubArrSorted.get(j)) {
//				sortedSubList.add(leftSubArrSorted.get(i));
//				i ++;
//			} else {
//				sortedSubList.add(rightSubArrSorted.get(j));
//				j ++;
//			}
//		}
//		
//		if(i != leftSubArrSorted.size()) {
//			while(i != leftSubArrSorted.size()) {
//				sortedSubList.add(leftSubArrSorted.get(i));
//				i ++;
//			}
//		}
//		
//		if(j != rightSubArrSorted.size()) {
//			while(j != rightSubArrSorted.size()) {
//				sortedSubList.add(rightSubArrSorted.get(j));
//				j ++;
//			}
//		}
//		
//		return sortedSubList;
//	}
	
}
