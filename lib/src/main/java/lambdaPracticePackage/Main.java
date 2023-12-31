package lambdaPracticePackage;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    // create an ArrayList
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    System.out.println("ArrayList: " + numbers);

    System.out.print("After operation performed on each element of ArrayList without modifying the action values in the ArrayList : ");

    // multiply each element by 10
    // using the lambda expression
    numbers.forEach((e) -> {
      e = e * 10;
      System.out.print(e + " ");
    });
    
    System.out.println();
    System.out.println("ArrayList: " + numbers);

  }
}