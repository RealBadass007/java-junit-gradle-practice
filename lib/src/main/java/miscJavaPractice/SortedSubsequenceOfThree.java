package miscJavaPractice;

public class SortedSubsequenceOfThree {

	public static void main(String[] args) {
		int arr[] = {8,22,14,9,7,2,61,9} ;
        int n = arr.length; 
        find3Numbers(arr, n); 
	}
	
	static void find3Numbers(int arr[], int n) 
    { 
        // Initializing small and large(second smaller) 
        // by INT_MAX 
        int small = +2147483647, large = +2147483647; 
        int i; 
        for (i = 0; i < n; i++) 
        { 
            // Update small for smallest value of array 
            if (arr[i] <= small) {
            	small = arr[i];
            	System.out.println("small = arr[i] => " + small);
            }
                
      
            // Update large for second smallest value of 
            // array after occurrence of small 
            else if (arr[i] <= large) {
            	large = arr[i]; 
            	System.out.println("large = arr[i] => " + large);
            }
      
            // If we reach here, we found 3 numbers in 
            // increasing order : small, large and arr[i] 
            else {
            	System.out.println("Breaking");
            	break; 
            }
        } 
      
        if (i == n) 
        { 
            System.out.print("No such triplet found"); 
            return; 
        } 
      
        // last and second last will be same, but first 
        // element can be updated retrieving first element 
        // by looping upto i 
        for (int j = 0; j <= i; j++) 
        { 
            if (arr[j] < large) 
            { 
            	System.out.println("arr[j] < large => " + arr[j] + " " + large);
                small = arr[j]; 
                System.out.println("small => " + small);
                break; 
            } 
        } 
      
        System.out.print(small+" "+large+" "+arr[i]); 
        return; 
    } 
	
}
