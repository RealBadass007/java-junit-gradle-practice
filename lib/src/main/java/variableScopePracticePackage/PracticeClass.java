package variableScopePracticePackage;

public class PracticeClass {
    private static int classVariable1 = 10;
    private static int classVariable2NotInitialized;

    private int instanceVariable1 = 20;
    private int instanceVariable2NotInitialized;
    
    //WE CAN DECLARE CLASS or INSTANCE VARIABLES AND NOT INITIALIZE IT.
    //THIS DOESN'T THROW ANY EXCEPTION AND JUST ASSUMES DEFAULT VALUE
    
    
    //Constructor
    // ARGUMENTS PASSED INTO CONSTRUCTORS or METHODS ARE LOCAL VARIABLES
    public PracticeClass(int localVariable1, int localVariable2) {
    	classVariable1 = localVariable1;
		this.instanceVariable1 = localVariable2;
		
		int localVariable3 = 40; // THIS IS A LOCAL VARIABLE TOO
		
		this.instanceVariable2NotInitialized = localVariable3;
		
		int localVariable4;
		// JUST DECLARING A LOCAL VARIABLE WITHOUT INITIALIZING IT WILL NOT THROW AN EXCEPTION BY ITSELF
		//BUT WE WILL GET A COMPILE TIME EXCEPTION IF WE TRY TO USE THIS LOCAL VARIABLE WITHOUT INITIALIZATION
		//System.out.println(localVariable4); // <- This line will throw exception
		
		//WE WON'T RECEIVE THIS EXCEPTION IN CASE OF CLASS OR INSIANCE VARIABLES
		System.out.println(classVariable2NotInitialized); // <- This line won't throw exception
		
	}
}

	

