package scannerVSBufferedReaderPackage;
// Code using Scanner Class
import java.util.Scanner;
class Differ
 {
    public static void main(String args[])
    {
        //import is java.util.Scanner
        Scanner scn = new Scanner(System.in);
 
        System.out.println("Enter an integer & a String");
 
        // Using nextInt() to parse integer values
        int a = scn.nextInt();
        // Using nextLine() to parse string values
        String b = scn.nextLine();
 
        // Display name and age entered above
        System.out.printf("You have entered:- " + a + " " + "and name as " + b);
    }

}