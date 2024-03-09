package sortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class MergeSortArrayPracticeTest {

	@Test
	void sortingTestWithTenElements() {
		
		List<Integer> numsList = new Random().ints(10, 0, 200).boxed().collect(Collectors.toList());
		
		int[] numsArr = new int[numsList.size()];
		
		for(int i = 0; i < numsList.size(); i++) {
			numsArr[i] = numsList.get(i);
		}
		
		int[] ogNumsArr = Arrays.copyOf(numsArr, numsArr.length);
		
		MergeSortArrayPractice.mergeSort(numsArr);
		
		Arrays.sort(ogNumsArr);
		
		Assertions.assertArrayEquals(ogNumsArr, numsArr);
	
	}
	
	@Test
	void sortingTestWithFiftyElements() {
		
		List<Integer> numsList = new Random().ints(50, 0, 500).boxed().collect(Collectors.toList());

		int[] numsArr = new int[numsList.size()];
		
		for(int i = 0; i < numsList.size(); i++) {
			numsArr[i] = numsList.get(i);
		}
		
		int[] ogNumsArr = Arrays.copyOf(numsArr, numsArr.length);
		
		MergeSortArrayPractice.mergeSort(numsArr);
		
		Arrays.sort(ogNumsArr);
		
		Assertions.assertArrayEquals(ogNumsArr, numsArr);
	
	}
	
	@Test
	void sortingTestWithThousandElements() {
		
		List<Integer> numsList = new Random().ints(1000, 0, 10000).boxed().collect(Collectors.toList());

		int[] numsArr = new int[numsList.size()];
		
		for(int i = 0; i < numsList.size(); i++) {
			numsArr[i] = numsList.get(i);
		}
		
		int[] ogNumsArr = Arrays.copyOf(numsArr, numsArr.length);
		
		MergeSortArrayPractice.mergeSort(numsArr);
		
		Arrays.sort(ogNumsArr);
		
		Assertions.assertArrayEquals(ogNumsArr, numsArr);
	
	}
	
	@Test
	@Timeout(value = 200, unit = TimeUnit.MILLISECONDS)
	void sortingTestWithTenThousandElements() {
		
		List<Integer> numsList = new Random().ints(10000, 0, 1000000).boxed().collect(Collectors.toList());

		int[] numsArr = new int[numsList.size()];
		
		for(int i = 0; i < numsList.size(); i++) {
			numsArr[i] = numsList.get(i);
		}
		
		int[] ogNumsArr = Arrays.copyOf(numsArr, numsArr.length);
		
		MergeSortArrayPractice.mergeSort(numsArr);
		
		Arrays.sort(ogNumsArr);
		
		Assertions.assertArrayEquals(ogNumsArr, numsArr);
	
	}
	
	@Test
	@Timeout(value = 2000, unit = TimeUnit.MILLISECONDS)
	void sortingTestWithTenLakhElements() {
		
		List<Integer> numsList = new Random().ints(1000000, 0, 1000000).boxed().collect(Collectors.toList());

		int[] numsArr = new int[numsList.size()];
		
		for(int i = 0; i < numsList.size(); i++) {
			numsArr[i] = numsList.get(i);
		}
		
		int[] ogNumsArr = Arrays.copyOf(numsArr, numsArr.length);
		
		MergeSortArrayPractice.mergeSort(numsArr);
		
		Arrays.sort(ogNumsArr);
		
		Assertions.assertArrayEquals(ogNumsArr, numsArr);
	
	}
	
	@Test
	void sortingTestWithThreeElements() {
		
		List<Integer> numsList = new Random().ints(3, 0, 1000).boxed().collect(Collectors.toList());

		int[] numsArr = new int[numsList.size()];
		
		for(int i = 0; i < numsList.size(); i++) {
			numsArr[i] = numsList.get(i);
		}
		
		int[] ogNumsArr = Arrays.copyOf(numsArr, numsArr.length);
		
		MergeSortArrayPractice.mergeSort(numsArr);
		
		Arrays.sort(ogNumsArr);
		
		Assertions.assertArrayEquals(ogNumsArr, numsArr);
	
	}
	
	@Test
	void sortingTestWithTwoElements() {
		
		List<Integer> numsList = new Random().ints(2, 0, 1000).boxed().collect(Collectors.toList());

		int[] numsArr = new int[numsList.size()];
		
		for(int i = 0; i < numsList.size(); i++) {
			numsArr[i] = numsList.get(i);
		}
		
		int[] ogNumsArr = Arrays.copyOf(numsArr, numsArr.length);
		
		MergeSortArrayPractice.mergeSort(numsArr);
		
		Arrays.sort(ogNumsArr);
		
		Assertions.assertArrayEquals(ogNumsArr, numsArr);
	
	}
	
	@Test
	void sortingTestWithOneElements() {
		
		List<Integer> numsList = new Random().ints(1, 0, 1000).boxed().collect(Collectors.toList());

		int[] numsArr = new int[numsList.size()];
		
		for(int i = 0; i < numsList.size(); i++) {
			numsArr[i] = numsList.get(i);
		}
		
		int[] ogNumsArr = Arrays.copyOf(numsArr, numsArr.length);
		
		MergeSortArrayPractice.mergeSort(numsArr);
		
		Arrays.sort(ogNumsArr);
		
		Assertions.assertArrayEquals(ogNumsArr, numsArr);
	
	}
	
	@Test
	void sortingTestWithZeroElements() {
		
		List<Integer> numsList = new Random().ints(0, 0, 1000).boxed().collect(Collectors.toList());

		int[] numsArr = new int[numsList.size()];
		
		for(int i = 0; i < numsList.size(); i++) {
			numsArr[i] = numsList.get(i);
		}
		
		int[] ogNumsArr = Arrays.copyOf(numsArr, numsArr.length);
		
		MergeSortArrayPractice.mergeSort(numsArr);
		
		Arrays.sort(ogNumsArr);
		
		Assertions.assertArrayEquals(ogNumsArr, numsArr);
	
	}

}
