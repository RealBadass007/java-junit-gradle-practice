package multithreadingExecutorService;

public class MyRunnable implements Runnable {

	String name;
	
	MyRunnable (String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println("Printing => " + this.name);
	}

}
