package streamApiPracticePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamApiPractice {

	public static void main(String[] args) {
		
		List<Integer> listOfNums = Arrays.asList(1,2,3,4,5);
		
//		System.out.println(listOfNums);
		
		List<Integer> newListOfNums = listOfNums.stream().map(n -> n * 2).collect(Collectors.toList());
		
		System.out.println(newListOfNums);
		
		List<Integer> newListOfSortedNums = IntStream.range(1, 51).boxed().collect(Collectors.toList());
		
		System.out.println(newListOfSortedNums);
		
		//DOESN'T THROW EXCEPTION
		newListOfSortedNums.remove(0);
		
		System.out.println(newListOfSortedNums);
		
		//LIST OF 5 RANDOM INTEGERS WITHIN RANGE OF 0 to 199
		List<Integer> numsList = new Random().ints(5, 0, 200).boxed().collect(Collectors.toList());
		
	}
	
}
