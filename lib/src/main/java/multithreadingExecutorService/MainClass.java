package multithreadingExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainClass {

	public static void main(String[] args) {
		
		//https://www.baeldung.com/java-executor-service-tutorial
		//https://www.youtube.com/watch?v=sIkG0X4fqs4
		
		
		String[] fullName = {"Chirag", "Purshottam", "Bangera", "Suma"};
		
		
		///////////////////
		
//		ExecutorService es = Executors.newFixedThreadPool(5);	//To define a fixed pool size of threads
//		
//		for(String name : fullName) {
//			es.execute(new MyRunnable(name));		//use execute or submit for class that implements Runnable
////			es.submit(new MyRunnable(name));
//		}
		
		///////////////////
		
		//IF WE WANT TO EXECUTE ONE TASK AFTER ANOTHER IN A FIXED ORDER, USE newSingleThreadExecutor
		//If any exception is thrown in the thread, it is killed and a new thread is created and the execution of
		//other tasks in the queue continues
		
//		ExecutorService singleThreadEs = Executors.newSingleThreadExecutor();
//		
//		for(String name : fullName) {
//			singleThreadEs.execute(new MyRunnable(name));
//		}
		
		///////////////////
		
		
		//No fixed pool size is defined. Dynamically threads are created based whether a thread is free or not
		//If a thread remains free for more than 60 seconds, the executor kills it
		
//		ExecutorService es = Executors.newCachedThreadPool();	
//		
//		for(String name : fullName) {
//			es.execute(new MyRunnable(name));
//		}
		
		///////////////////
		
		
		//Runs tasks after some predefined delay and/or periodically.
		
//		ScheduledExecutorService sEs = Executors.newScheduledThreadPool(5);	
//		
//		for(String name : fullName) {
////			es.schedule(new MyCallable(name), 1, TimeUnit.SECONDS);
//			//The ExecutorService interface does not have the method schedule() which is 
//			//required to schedule tasks. So we have to use ScheduledExecutorService
//			
//			//execute all threads after a delay of 2 seconds
////			sEs.schedule(new MyRunnable(name), 2, TimeUnit.SECONDS);
//			
//			
////			//execute all threads after a delay of 2 seconds			
////			int secondsDelay = 2;
////			sEs.scheduleAtFixedRate(new MyHealthCheckRunnable(secondsDelay), 0, secondsDelay, TimeUnit.SECONDS);
//			
//			
//			//execute all threads after a delay of 2 seconds			
//			int secondsDelay = 2;
//			sEs.scheduleWithFixedDelay(new MyHealthCheckRunnable(secondsDelay), 0, secondsDelay, TimeUnit.SECONDS);
//			
//			
//			//STUDY THE DIFFERENCE BETWEEN THESE TWO!!!!!
//			
//		}
		
		///////////////////
		
		
		
		//// Separate Method for Callable Practice:'
		
		
		extensionExecutorsUsingCallable();
		
	}

	private static void extensionExecutorsUsingCallable() {
		
		int threadPoolSize = 5;
		
		List<Integer> bigList = new ArrayList<>();
		
		int ogSum = 0;
		
		for(int i = 1; i < 5000 ; i++) {
			bigList.add(i);
			ogSum += i;
		}
		
		System.out.println("ogSum => " + ogSum);
		
		List<List<Integer>> partitions = new ArrayList<>();
		
//		for(int i = 0; i < threadPoolSize ; i ++) {
//			partitions.add(bigList);
//		}

		
		ExecutorService execSer = Executors.newFixedThreadPool(threadPoolSize);
		
		int l = 0;
		int r = bigList.size() / threadPoolSize;
		
		CallableAddNumbers addNumbers = null;
		
		List<Future<Integer>> listOfFutureSums = new ArrayList<>();
		
//		for(int i = 0; i < threadPoolSize; i++) {
//			
////			System.out.println("old l => " + l);
////			System.out.println("old r => " + r);
//			
//			addNumbers = new CallableAddNumbers(l, r, bigList);
//			listOfFutureSums.add(execSer.submit(addNumbers));			//always use submit for class that implements Callable
//			l = r + 1;
//			r = r + bigList.size() / threadPoolSize + 1;
//			
////			System.out.println("new l => " + l);
////			System.out.println("new r => " + r);
////			System.out.println();
//		}
//		
//		while(true) {
//			
//			boolean isOperationComplete = false;
//			
//			for(int i = 0; i < listOfFutureSums.size() ; i++) {
//				if(!listOfFutureSums.get(i).isDone()) {
//					break;
//				}
//				isOperationComplete = true;
//			}
//			
//			if(isOperationComplete) {
//				int sum = 0;
//				
//				for(int i = 0; i < listOfFutureSums.size();i++) {
//					try {
//						sum += listOfFutureSums.get(i).get();
//					} catch (InterruptedException | ExecutionException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//				
//				System.out.println("Sum => " + sum);
//				
//				break;
//			}
//			
//		}
		
		
		//USING INVOKE ALL!
		
		List<CallableAddNumbers> callableList = new ArrayList<>();
		
		for(int i = 0; i < threadPoolSize; i++) {
			
			callableList.add(new CallableAddNumbers(new CustomArrayPartitionDTO(l, r, bigList)));
			
			l = r + 1;
			r = r + bigList.size() / threadPoolSize + 1;
			
		}
		
		try {
			listOfFutureSums = execSer.invokeAll(callableList);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		int sum = 0;
		
		for(int i = 0; i < listOfFutureSums.size(); i++) {
			try {
				sum += listOfFutureSums.get(i).get();
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Sum2 => " + sum);
			
	}
	
}
