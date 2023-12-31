package threadPracticePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreadPracticeMainClass {
	
	public static List<Integer> num = new ArrayList<Integer>(Arrays.asList(1));
	
	public int number;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public static void main(String[] args) {
		
		ThreadPracticeMainClass practiceClassObj = new ThreadPracticeMainClass();
		practiceClassObj.setNumber(1);
		
		ThreadPractice threadObj = new ThreadPractice(practiceClassObj, 4);
		ThreadPractice threadObj2 = new ThreadPractice(practiceClassObj, 9);
		
		threadObj.start();
		threadObj2.start();
		

	}

	
	public synchronized void addTen(int num) {
		
		synchronized(this) {
			for(int i = 0; i < 10; i++) {
				num += 10;
				System.out.println("num =>" + num);
			}
		}
	}
	
	public synchronized static void addTenStatic(int num) {
		
//		synchronized(ThreadPracticeMainClass.class) {
			for(int i = 0; i < 10; i++) {
				num += 10;
				System.out.println("num =>" + num);
			}
//		}
	}

}
