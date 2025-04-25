package problem_solving3;

import java.util.Scanner;

public class WhileLoop {
  //19  While loop Program in java
  public static void main(String[] args) {
      int n;
      Scanner input = new Scanner(System.in);
      System.out.println("Input an integer");
      while ((n = input.nextInt()) != 0) {
          System.out.println("You entered " + n);
          System.out.println("Input an integer");
      }
      System.out.println("Out of loop");

  }

}
