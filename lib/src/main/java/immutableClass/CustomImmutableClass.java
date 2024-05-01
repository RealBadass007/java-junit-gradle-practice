package immutableClass;

import java.util.HashMap;
import java.util.Map;

public final class CustomImmutableClass {

	// Member attributes of final class
    private final String name;
    private final int regNo;
    private final Map<String, String> metadata;
    
    
    // Parameterized constructor
    public CustomImmutableClass(String name, int regNo,
                   Map<String, String> metadata)
    {
 
        this.name = name;
        this.regNo = regNo;
 
        // Creating Map object with reference to HashMap
        // Declaring object of string type
        Map<String, String> tempMap = new HashMap<>();
 
        // Iterating using for-each loop performing a DEEP COPY (IMPORTANT!)
        for (Map.Entry<String, String> entry :
             metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
 
        this.metadata = tempMap;
    }
    
    /// NO SETTER METHODS. Only getter methods
    
    public String getName() { return name; }
 
    public int getRegNo() { return regNo; }
   
    // Note that there should not be any setters 
 
    // Method 3
    // User -defined type
    // To get meta data
    public Map<String, String> getMetadata()
    {
 
        // Creating Map with HashMap reference
        Map<String, String> tempMap = new HashMap<>();
 
        for (Map.Entry<String, String> entry :
             this.metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
	
}
