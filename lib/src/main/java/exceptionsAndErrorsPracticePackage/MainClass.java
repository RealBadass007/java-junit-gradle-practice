package exceptionsAndErrorsPracticePackage;

import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		
		try {
			new ExceptionAndErrorClass().throwCheckedException();
		} catch (IOException e) {
			System.out.println("Checked Exception Caught");
		}
		
		new ExceptionAndErrorClass().throwRuntimeException();
		
		new ExceptionAndErrorClass().throwError();
		
		
		try {
			new ExceptionAndErrorClass().throwJavaLangException();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			new ThrowableClass().throwError();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
