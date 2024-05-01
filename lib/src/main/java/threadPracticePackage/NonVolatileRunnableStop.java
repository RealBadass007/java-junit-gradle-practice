package threadPracticePackage;

public class NonVolatileRunnableStop implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Entered VolatileRunnableStop");
		while(true) {
			if(ClassWithoutVolatilleVariable.count == 100) {
				ClassWithoutVolatilleVariable.isActive = false;
				break;
			}
 		}
		System.out.println("Changed variable state to stop");
	}

}
