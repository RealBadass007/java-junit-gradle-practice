package threadPracticePackage;

//import java.util.stream.IntStream;

public class ThreadPractice extends Thread {
	
	ThreadPracticeMainClass practiceClassObj;
	int i;
	
	public ThreadPractice(ThreadPracticeMainClass practiceClassObj, int i) {
		this.practiceClassObj = practiceClassObj;
		this.i = i;
	}

	public void run() {

//		practiceClassObj = new ThreadPracticeMainClass();
//		practiceClassObj.setNumber(1);
//		practiceClassObj.addTen(practiceClassObj.getNumber() + i);
		
		ThreadPracticeMainClass.addTenStatic(practiceClassObj.getNumber() + i);
		
	}
	
}
