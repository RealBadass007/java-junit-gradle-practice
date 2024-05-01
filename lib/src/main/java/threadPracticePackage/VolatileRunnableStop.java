package threadPracticePackage;

public class VolatileRunnableStop implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Entered VolatileRunnableStop");
		while(true) {
			if(ClassWithVolatilleVariable.count == 100) {
				ClassWithVolatilleVariable.isActive = false;
				break;
			}
 		}
		System.out.println("Changed variable state to stop");
	}

}
