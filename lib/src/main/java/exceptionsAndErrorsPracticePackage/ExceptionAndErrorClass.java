package exceptionsAndErrorsPracticePackage;

import java.io.IOException;

public class ExceptionAndErrorClass {

	//checked Exception. Have to declare "throws" in method signature
	public void throwCheckedException() throws IOException {
		throw new IOException();
	}
	
	//runtime exception. No need to declare "throws"
	public void throwRuntimeException(){
		throw new RuntimeException();
	}
	
	//error. No need to declare "throws"
	public void throwError(){
		throw new StackOverflowError();
	}
	
	//The base class of all Exceptions - java.lang.Exception is also a checked Exception! Have to declare "throws" in method signature
	//Runtime Exceptions & Checked both come under java.lang.Exception.
	public void throwJavaLangException() throws java.lang.Exception {
		throw new java.lang.Exception();
	}
	
}
