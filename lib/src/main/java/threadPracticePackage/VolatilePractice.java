package threadPracticePackage;

public class VolatilePractice {

	public static void main(String[] args) {
		
		//// Run by commenting out one block from below
		
		/////// CLASS WITHOUT VOLATILE VARIABLES ///////
		NonVolatileRunnableStart nvrstart = new NonVolatileRunnableStart();
		NonVolatileRunnableStop nvrstop = new NonVolatileRunnableStop();
		
		Thread t1 = new Thread(nvrstart);
		Thread t2 = new Thread(nvrstop);
		
		t1.start();
		t2.start();
		/////// CLASS WITHOUT VOLATILE VARIABLES ///////
		
//		/////// CLASS WITH VOLATILE VARIABLES ///////
//		VolatileRunnableStart vrstart = new VolatileRunnableStart();
//		VolatileRunnableStop vrstop = new VolatileRunnableStop();
//		
//		Thread t1 = new Thread(vrstart);
//		Thread t2 = new Thread(vrstop);
//		
//		t1.start();
//		t2.start();
//		/////// CLASS WITH VOLATILE VARIABLES ///////
		
	}
	
}
