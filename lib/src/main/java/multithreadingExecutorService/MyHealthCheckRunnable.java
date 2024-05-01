package multithreadingExecutorService;

public class MyHealthCheckRunnable implements Runnable {

	int n;
	
	MyHealthCheckRunnable (int n) {
		this.n = n;
	}
	
	@Override
	public void run() {
		System.out.println("Health Check of thread " + Thread.currentThread().getId() +  " after every " + n + " seconds");
	}

}
