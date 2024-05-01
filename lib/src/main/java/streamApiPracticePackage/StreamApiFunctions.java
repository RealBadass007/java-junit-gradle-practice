package streamApiPracticePackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiFunctions {

	public static void main(String[] args) {
		
		//https://www.jadeglobal.com/blog/introduction-java-eight-stream-api
		//https://www.geeksforgeeks.org/stream-in-java/
		//https://www.youtube.com/watch?v=t1-YZ6bF-g0
		
		List<Integer> listOfNums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		
		/*
		 * 		INTERMEDIATE OPERATIONS BELOW (Functions that return a stream)
		 * 		These operations can be performed one after another
		 */
		
		
		//collect function
		List<Integer> newListOfNums = listOfNums.stream().collect(Collectors.toList());
		System.out.println("After collect => " + newListOfNums);
		
		//FI = Functional Interface
		
		//map function (Function FI)
		List<Integer> newDoubleListOfNums = listOfNums.stream().map(n -> n * 2).collect(Collectors.toList());
		System.out.println("After map => " + newDoubleListOfNums);
		
		
		//filter function (Predicate FI)
		List<Integer> newFilteredListOfEvenNums = listOfNums.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		System.out.println("After filter => " + newFilteredListOfEvenNums);
		
		
		//sort function (Comparator FI)
//		List<Integer> newReversedListOfNums = listOfNums.stream().sorted(Comparator.comparing((a) -> -a)).collect(Collectors.toList());
		List<Integer> newReversedListOfNums = listOfNums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("After sort => " + newReversedListOfNums);
		
		
		//skip (skips initial n elements)
		List<Integer> listNumsAfterSkippingFirstNElements = listOfNums.stream().skip(4).collect(Collectors.toList());
		System.out.println("After skipping => " + listNumsAfterSkippingFirstNElements);
		
		
		
		
		//flatMap, anyMatch, distinct, findFirst
		//https://www.baeldung.com/java-stream-findfirst-vs-findany
		
		
		/*
		 * 		TERMINAL OPERATIONS BELOW (Functions with return type as void or return a single value)
		 * 		Only one terminal operation is allowed at the end of one or more intermediate operations
		 */
		
		//forEach
		listOfNums.stream().forEach(System.out::print);
		System.out.println();
		
		listOfNums.stream().forEach((a) -> System.out.print(a + " "));
		System.out.println();
		
		//min and max (Comparator FI)	
		Optional<Integer> minOptional = listOfNums.stream().min(Comparator.comparing(Integer::valueOf));
		Optional<Integer> maxOptional = listOfNums.stream().max(Comparator.comparing(Integer::valueOf));
		
		System.out.println(minOptional.isPresent() ? "Min => " + minOptional.get() : "No min value present");
		System.out.println(maxOptional.isPresent() ? "Max => " + maxOptional.get() : "No max value present");
		
		
		//count 
		long elementCount = listOfNums.stream().count();
		System.out.println("Number of elements => " + elementCount);
		
		long oddElementCount = listOfNums.stream().filter(n -> n % 2 != 0).count();
		System.out.println("Number of odd elements => " + oddElementCount);
		
		
		//reduce (0 is initial value)
		int sum = listOfNums.stream().reduce(0, (a, b) -> a + b);
		System.out.println("Sum of elements => " + sum);
		
		int sumWithInitialValueAs5 = listOfNums.stream().reduce(5, (a, b) -> a + b);
		System.out.println("Sum of elements with initial value as 5 => " + sumWithInitialValueAs5);
		
		
	}
	
}
