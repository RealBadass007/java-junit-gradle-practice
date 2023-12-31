package searchingAlgorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class BinarySearchPracticeTest {

	@Test
	void testElementSevenInArray() {
		
		List<Integer> sortedArray = IntStream.range(1, 31).boxed().collect(Collectors.toList());
		assertEquals(6,BinarySearchPractice.binarySearch(sortedArray, 7));
		
	}
	
	@Test
	void testElementFifteenInArray() {
		
		List<Integer> sortedArray = IntStream.range(1, 31).boxed().collect(Collectors.toList());
		assertEquals(14,BinarySearchPractice.binarySearch(sortedArray, 15));
		
	}
	
	@Test
	void testElementTwentyNineInArray() {
		
		List<Integer> sortedArray = IntStream.range(1, 31).boxed().collect(Collectors.toList());
		assertEquals(28,BinarySearchPractice.binarySearch(sortedArray, 29));
		
	}
	
	@Test
	void testLeftEdgeCaseElementInArray() {
		
		List<Integer> sortedArray = IntStream.range(1, 31).boxed().collect(Collectors.toList());
		assertEquals(0,BinarySearchPractice.binarySearch(sortedArray, 1));
		
	}
	
	@Test
	void testLeftEdgeCaseElementNotInArray() {
		
		List<Integer> sortedArray = IntStream.range(1, 31).boxed().collect(Collectors.toList());
		assertEquals(-1,BinarySearchPractice.binarySearch(sortedArray, 0));
		
	}
	
	@Test
	void testRightEdgeCaseElementInArray() {
		
		List<Integer> sortedArray = IntStream.range(1, 31).boxed().collect(Collectors.toList());
		assertEquals(29,BinarySearchPractice.binarySearch(sortedArray, 30));
		
	}
	
	@Test
	void testRightEdgeCaseElementNotInArray() {
		
		List<Integer> sortedArray = IntStream.range(1, 31).boxed().collect(Collectors.toList());
		assertEquals(-1,BinarySearchPractice.binarySearch(sortedArray, 31));
		
	}

}
