package problem_solving3;

import java.util.Scanner;

public class Palindrome {
  //31  Check Given No is palindrome or Not in java Program
  public static void main(String[] args) {
      String original, reverse = "";
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string to check if it is a palindrome");
      original = in.nextLine();
      int length = original.length();
      for ( int i = length - 1; i >= 0; i-- )
          reverse = reverse + original.charAt(i);
      if (original.equals(reverse))
          System.out.println("Entered string is a palindrome.");
      else
          System.out.println("Entered string is not a palindrome.");

  }
}
