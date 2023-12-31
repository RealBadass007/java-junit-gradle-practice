package sortingAlgorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class MergeSortPracticeTest {

	@Test
	void sortingTestWithTenElements() {
		
		List<Integer> numsList = new Random().ints(10, 0, 200).boxed().collect(Collectors.toList());
		
		List<Integer> mySortedNumsList = MergeSortPractice.mergeSort(numsList);
		
		Collections.sort(numsList);
		
		Assertions.assertIterableEquals(numsList, mySortedNumsList);
	
	}
	
	@Test
	void sortingTestWithFiftyElements() {
		
		List<Integer> numsList = new Random().ints(50, 0, 500).boxed().collect(Collectors.toList());
		
		List<Integer> mySortedNumsList = MergeSortPractice.mergeSort(numsList);
		
		Collections.sort(numsList);
		
		Assertions.assertIterableEquals(numsList, mySortedNumsList);
	
	}
	
	@Test
	void sortingTestWithThousandElements() {
		
		List<Integer> numsList = new Random().ints(1000, 0, 10000).boxed().collect(Collectors.toList());
		
		List<Integer> mySortedNumsList = MergeSortPractice.mergeSort(numsList);
		
		Collections.sort(numsList);
		
		Assertions.assertIterableEquals(numsList, mySortedNumsList);
	
	}
	
	@Test
	@Timeout(value = 200, unit = TimeUnit.MILLISECONDS)
	void sortingTestWithTenThousandElements() {
		
		List<Integer> numsList = new Random().ints(10000, 0, 1000000).boxed().collect(Collectors.toList());
		
		List<Integer> mySortedNumsList = MergeSortPractice.mergeSort(numsList);
		
		Collections.sort(numsList);
		
		Assertions.assertIterableEquals(numsList, mySortedNumsList);
	
	}
	
	@Test
	@Timeout(value = 2000, unit = TimeUnit.MILLISECONDS)
	void sortingTestWithTenLakhElements() {
		
		List<Integer> numsList = new Random().ints(1000000, 0, 1000000).boxed().collect(Collectors.toList());
		
		List<Integer> mySortedNumsList = MergeSortPractice.mergeSort(numsList);
		
		Collections.sort(numsList);
		
		Assertions.assertIterableEquals(numsList, mySortedNumsList);
	
	}
	
	@Test
	void sortingTestWithThreeElements() {
		
		List<Integer> numsList = new Random().ints(3, 0, 1000).boxed().collect(Collectors.toList());
		
		List<Integer> mySortedNumsList = MergeSortPractice.mergeSort(numsList);
		
		Collections.sort(numsList);
		
		Assertions.assertIterableEquals(numsList, mySortedNumsList);
	
	}
	
	@Test
	void sortingTestWithTwoElements() {
		
		List<Integer> numsList = new Random().ints(2, 0, 1000).boxed().collect(Collectors.toList());
		
		List<Integer> mySortedNumsList = MergeSortPractice.mergeSort(numsList);
		
		Collections.sort(numsList);
		
		Assertions.assertIterableEquals(numsList, mySortedNumsList);
	
	}
	
	@Test
	void sortingTestWithOneElements() {
		
		List<Integer> numsList = new Random().ints(1, 0, 1000).boxed().collect(Collectors.toList());
		
		List<Integer> mySortedNumsList = MergeSortPractice.mergeSort(numsList);
		
		Collections.sort(numsList);
		
		Assertions.assertIterableEquals(numsList, mySortedNumsList);
	
	}
	
	@Test
	void sortingTestWithZeroElements() {
		
		List<Integer> numsList = new Random().ints(0, 0, 1000).boxed().collect(Collectors.toList());
		
		List<Integer> mySortedNumsList = MergeSortPractice.mergeSort(numsList);
		
		Collections.sort(numsList);
		
		Assertions.assertIterableEquals(numsList, mySortedNumsList);
	
	}

}
