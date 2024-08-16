package streamApiPracticePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApiPractice {

	public static void main(String[] args) {
		
		List<Integer> listOfNums = Arrays.asList(1,2,3,4,5);
		
//		System.out.println(listOfNums);
		
		// Multiply all numbers in stream by 2
		List<Integer> newListOfNums = listOfNums.stream().map(n -> n * 2).collect(Collectors.toList());
		System.out.println(newListOfNums);
		
		
		// Create a list of all numbers from 1 to 50
		List<Integer> newListOfSortedNums = IntStream.range(1, 51).boxed().collect(Collectors.toList());
		System.out.println(newListOfSortedNums);
		//DOESN'T THROW EXCEPTION !
		newListOfSortedNums.remove(0);
		System.out.println(newListOfSortedNums);
		System.out.println();
		
		
		//LIST OF 5 RANDOM INTEGERS WITHIN RANGE OF 0 to 199
		List<Integer> numsList = new Random().ints(5, 0, 200).boxed().collect(Collectors.toList());
		
		
		//Adding all elements in list using Steram API
		List<Integer> listOfNums2 = Arrays.asList(1,2,3,4,5);
		System.out.println(listOfNums2.stream().mapToInt(Integer::intValue).sum());
		System.out.println(listOfNums2.stream().reduce(0, (a, b) -> a + b));
		
		System.out.println("IntStream sum => " + IntStream.range(0, 10).sum());
		System.out.println();
		
		
		
//		//Adding all elements in parallel stream list using Stream API
//		List<Integer> newListOfMillionNums = IntStream.range(1, 150000001).boxed().collect(Collectors.toList());
//		long startTime1 = System.nanoTime();
//		int sum1 = newListOfMillionNums.stream().reduce(0, (a, b) -> a + b);
//		long endTime1 = System.nanoTime();
//		
//		System.out.println((endTime1 - startTime1) / 1_000_000_000.0);
//		
//		long startTime2 = System.nanoTime();
//		int sum2 = newListOfMillionNums.parallelStream().reduce(0, (a, b) -> a + b);
//		long endTime2 = System.nanoTime();
//		
//		System.out.println((endTime2 - startTime2) / 1_000_000_000.0);
//		System.out.println();
		
		
		//// Sorting based on number of occurances
		List<String> strlist = Arrays.asList("Chirag", "Bangera", "Purshottam", "Chirag", "Suma", "Purshottam", "Lokaya");
		
		strlist.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().sorted(Entry.comparingByValue(Comparator.reverseOrder())).forEach( (pair) -> System.out.println(pair.getKey()));
		
	}
	
}
