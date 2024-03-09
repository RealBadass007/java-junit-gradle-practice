package sortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MergeSortArrayPractice {

	public static void main(String[] args) {
		
		List<Integer> numsList = new Random().ints(5, 0, 200).boxed().collect(Collectors.toList());
		
		int[] numsArr = new int[numsList.size()];
		
		for(int i = 0; i < numsList.size(); i++) {
			numsArr[i] = numsList.get(i);
		}
		
		int[] ogNumsArray = Arrays.copyOf(numsArr, numsArr.length);
		
		System.out.println("ogNumsArray => " + Arrays.toString(ogNumsArray));
		
		mergeSort(numsArr);
		
		System.out.println("sorted numsArr => " + Arrays.toString(numsArr));
		System.out.println();
		System.out.println();
		Arrays.sort(ogNumsArray);
		
		if(numsArr.length != ogNumsArray.length) {
			System.out.println("Array length is not consistent");
			return;
		}
		
		System.out.println("java sorted numsArr => " + Arrays.toString(ogNumsArray));
		
		if(! Arrays.equals(ogNumsArray, numsArr)) {
			System.out.println("Error while sorting array");
			return;
		}
		
		System.out.println("Array sorted correctly");
		
	}

	static void mergeSort(int[] numsArr) {
		
		if(numsArr.length < 2) {
			return;
		}
		
		int mid = numsArr.length / 2;
		
		
		int[] leftArr  = Arrays.copyOfRange(numsArr, 0, mid);
		mergeSort(leftArr);
		
		int[] rightArr  = Arrays.copyOfRange(numsArr, mid, numsArr.length);
		mergeSort(rightArr);
		
		merge(numsArr, leftArr, rightArr);

	}

	private static void merge(int[] numsList, int[] leftArr, int[] rightArr) {
		
		int i = 0;
		int j = 0;
		
		int x = 0;
		
		// instead of creating a new arraylist, we'll just utilize the original sub-array 
		//which we cut in two halves
		
		while(i < leftArr.length && j < rightArr.length) {
			if(leftArr[i] <= rightArr[j]) {
				numsList[x++] = leftArr[i++];
			} else {
				numsList[x++] = rightArr[j++];
			}
		}
		
		while(i < leftArr.length) {
			numsList[x++] = leftArr[i++];
		}
		
		while(j < rightArr.length){
			numsList[x++] = rightArr[j++];
		}
	}
	
}
