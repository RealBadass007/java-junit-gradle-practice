package searchingAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class BinarySearchPractice {
	
	public static void main(String[] args) throws IOException{
		
		List<Integer> sortedArr = IntStream.range(1, 31).boxed().collect(Collectors.toList());
		
		System.out.println("sortedArr => " + sortedArr);
		
		System.out.println("Enter element to search :");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int elementToSearch = Integer.parseInt(br.readLine());
		
		int indexOfElement = binarySearch(sortedArr, elementToSearch);
		
		if(indexOfElement == -1) {
			System.out.println("Element not in array");
			return;
		}
		
		System.out.println("Index of " + elementToSearch + " is " + indexOfElement);
		
	}
	
	public static int binarySearch(List<Integer> sortedArr, int elementToSearch) {
		
		return binarySearchHelper(sortedArr, elementToSearch, 0, sortedArr.size() - 1);
		
	}
	
	public static int binarySearchHelper(List<Integer> sortedArr, int elementToSearch, int leftIdx, int rightIdx) {
		
//		System.out.println("Inside binarySearchHelper");
		
		if(leftIdx > rightIdx) {
			return -1;
		}
		
//		sortedArr = sortedArr.subList(leftIdx, rightIdx);
		
//		System.out.println("sublist => " + sortedArr);
		
		int midIndex = leftIdx + ((rightIdx - leftIdx)/2);
		int midElement = sortedArr.get(midIndex);
		
//		System.out.println("midElement => " + midElement);
		
		if(midElement == elementToSearch) {
			return midIndex;
		}
		
		if(elementToSearch < midElement) {
			rightIdx = midIndex - 1;
		} else {
			leftIdx = midIndex + 1;
		}
		
		return binarySearchHelper(sortedArr, elementToSearch, leftIdx, rightIdx);
		
	}
	
}
