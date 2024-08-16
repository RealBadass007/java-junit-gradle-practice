package collectionsApi;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class collectionsApi {

	public static void main(String[] args) {
		
//		arraySorting();
//		
//		queues();
//		
//		concurrentAccessToArrayLists();
//		
//		listToArrayAndArrayToListPrimitiveDatatype();
//		
//		listToArrayAndArrayToListObjectDataType();
		
		iteratingOverSetAndHashSet();
		
	}

	
	
	
	
	
	
	

	
	private static void iteratingOverSetAndHashSet() {
		
		HashSet<Integer> normalIntSet = new HashSet<>();
		normalIntSet.add(1);
		normalIntSet.add(2);
		normalIntSet.add(3);
		normalIntSet.add(4);
		normalIntSet.add(5);
		
//		for(int i = 0; i < normalIntSet.size(); i++) {
//			System.out.println(normalIntSet.get(i));	//THIS WON'T WORK LILE LIST BECAUSE HASHSETS AND HASHMAPS ARE UNORDERED!
//		}
		
		// 1. We can use an iterator
		
		Iterator<Integer> it = normalIntSet.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		//2 Or we can use the enhanced for loop
		
		for(Integer num : normalIntSet) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		
		
		//SAME WITH HASHMAPS

		HashMap<Integer, Integer> normalIntIntMap = new HashMap<>();
		normalIntIntMap.put(1, 10);
		normalIntIntMap.put(2, 20);
		normalIntIntMap.put(3, 30);
		normalIntIntMap.put(4, 40);
		normalIntIntMap.put(5, 50);
		
		// 1. We can use an iterator
		
		Iterator<Map.Entry<Integer, Integer>> itMap = normalIntIntMap.entrySet().iterator();
		
		while(itMap.hasNext()) {
			//System.out.print(itMap.next() + " ");
			Map.Entry<Integer, Integer> entry = itMap.next();
			System.out.print("Key => " + entry.getKey() + ", Value => " + entry.getValue() + ", ");
			
		}
		System.out.println();
		
		//2 Or we can use the enhanced for loop
		
		for(Map.Entry<Integer, Integer> entry : normalIntIntMap.entrySet()) {
//			System.out.print(entry + " ");
			System.out.print("Key => " + entry.getKey() + ", Value => " + entry.getValue() + ", ");
		}
		System.out.println();
		
	}


	private static void listToArrayAndArrayToListObjectDataType() {
		
		List<String> normalStringList = new ArrayList<>(Arrays.asList("1","2","3","4"));
		
		String[] stringArr = normalStringList.toArray(String[]::new);
//		String[] stringArr = normalStringList.stream().toArray(String[]::new);
		
		System.out.println(Arrays.toString(stringArr));

		String[] normalStringArr = {"1","2","3","4"};
		
		List<String> stringList = Arrays.stream(normalStringArr).collect(Collectors.toList());
		
		System.out.println(stringList);
	}

	
	private static void listToArrayAndArrayToListPrimitiveDatatype() {
		
		List<Integer> normalIntList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		
//		Integer[] intArr = normalList.toArray(Integer[]::new);	//But this is an Integer array and not an int array !
		
//		int[] intArr = IntStream.range(1, 8).toArray();
		
		//mapToInt returns an Instream
//		int[] intArr = normalList.stream().mapToInt(i -> i).toArray();
		int[] intArr = normalIntList.stream().mapToInt(Integer::valueOf).toArray();
		
		System.out.println(Arrays.toString(intArr));
		
		int[] normalIntArr = {1,2,3,4,5,6,7};
		
		List<Integer> intList = Arrays.stream(normalIntArr).boxed().collect(Collectors.toList());
		
		System.out.println(intList);
		
	}

	private static void concurrentAccessToArrayLists() {
		List<Integer> normalList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		
		Iterator<Integer> it = normalList.iterator();
		
		//If an element is added to the list, if we try to iterator over the same list with an iterator assigned before
		//the new element addition, it'll throw an exception!
//		normalList.add(5);
		
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		
		//We can use a CopyOnWriteArrayList to bypass this issue
		
		List<Integer> copyOnArrayList = new CopyOnWriteArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		
		//It creates a copy of the array to iterate over. If a new elements gets added, it gets added to the main array and not
		//the cloned array which we will iterator over next :-
		Iterator<Integer> it2 = copyOnArrayList.iterator();
		
		copyOnArrayList.add(8);
		
		while(it2.hasNext()) {
			//The new element added won't be reflected here!
			System.out.print(it2.next());
		}
		System.out.println();
		
		//Now the new element will be printed!
		it2 = copyOnArrayList.iterator();
		while(it2.hasNext()) {
			System.out.print(it2.next());
		}
	}

	private static void queues() {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(1);
		queue.offer(2);
		
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		deque.offer(1);
		deque.offerFirst(2);
		deque.offerLast(3);
		
		System.out.println(deque);
		
		System.out.println(deque.poll());
		System.out.println(deque.pollLast());
		System.out.println(deque.pollFirst());
		
		deque.add(1);
		deque.addFirst(2);
		deque.addLast(3);
		
		System.out.println(deque);
		
		System.out.println(deque.remove());
		System.out.println(deque.removeLast());
		System.out.println(deque.removeFirst());
		
		deque.push(3);
		
		System.out.println(deque);
		
		System.out.println(deque.pop());
		
		
		
		BlockingQueue<Integer> arrBlockQueue = new ArrayBlockingQueue<>(4);
		//OFFER and ADD implementation is different in ArrayBlockingQueue and Priority Queue. Rest all are the same
		arrBlockQueue.add(1);
		arrBlockQueue.offer(2);
		
		//put() method to use in case of blocking queue. If the queue is full, the thread goes to sleep until some other thread
		//removes an element from queue and makes space for a new element to be inserted
		try {
			arrBlockQueue.put(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//Similarly, use take method to remove from queue. If queue is empty, thread is blocked (goes to sleep)
		//untill some other thread inserts an element into it
		try {
			arrBlockQueue.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println();
	}

	private static void arraySorting() {
		int[] nums = new int[2];
		
		Arrays.sort(nums);
		
		List<Integer> list = new ArrayList<>();
		
		Collections.sort(list);
	}
	
}
