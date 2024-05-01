package immutableClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassWithFinalVariable {

	public final String name;
	public final List<Integer> listStr;
	
	public ClassWithFinalVariable(String name, List<Integer> listStr) {
		this.name = name;
		this.listStr = listStr;
	}
	
}
