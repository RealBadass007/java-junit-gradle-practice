package designPatterns.Creational.Factory;

public class FactoryExample {

	//used in java.lang.Runtime#getRuntime()
	
	private static FactoryExample singletonInstance;
	
	private FactoryExample() {
		
	}
	
	public static FactoryExample getInstance() {
		if(singletonInstance == null) {
			synchronized(FactoryExample.class) {
				if(singletonInstance == null) {
					singletonInstance = new FactoryExample();
				}
			}
		}
		return singletonInstance;
	}
	
}
