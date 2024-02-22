package exceptionsPracticePackage;

import java.io.IOException;

public class MainExceptionClass {

	public static void main(String[] args) {
		
		try {
			new ExceptionClass().throwCheckedException();
		} catch (IOException e) {
			System.out.println("Checked Exception Caught");
		}
		
		new ExceptionClass().throwRuntimeException();
		
		new ExceptionClass().throwError();
		
		
		try {
			new ExceptionClass().throwException();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			new ErrorClass().throwError();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
