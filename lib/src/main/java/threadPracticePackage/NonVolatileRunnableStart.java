package threadPracticePackage;

public class NonVolatileRunnableStart implements Runnable {
	
	@Override
	public void run() {
		ClassWithoutVolatilleVariable.isActive = true;
		while(ClassWithoutVolatilleVariable.isActive) {
			ClassWithoutVolatilleVariable.count++;
			System.out.println(ClassWithoutVolatilleVariable.count);
		}
		System.out.println("Outside while in run");
	}
}
