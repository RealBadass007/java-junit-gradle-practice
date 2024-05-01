package exceptionsAndErrorsPracticePackage;

public class ThrowableClass {

	//Parent class of all Exceptions AND Errors is also checked. HAVE to declare throws in method signature.
	public void throwError() throws Throwable {
		
		throw new java.lang.Throwable();
		
	}
	
}
