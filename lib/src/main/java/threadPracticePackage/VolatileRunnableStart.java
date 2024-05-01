package threadPracticePackage;

public class VolatileRunnableStart implements Runnable {
	
	@Override
	public void run() {
		ClassWithVolatilleVariable.isActive = true;
		while(ClassWithVolatilleVariable.isActive) {
			ClassWithVolatilleVariable.count++;
			System.out.println(ClassWithVolatilleVariable.count);
		}
		System.out.println("Outside while in run");
	}
}
