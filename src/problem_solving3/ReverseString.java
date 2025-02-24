package problem_solving3;

import java.util.Scanner;

public class ReverseString {
    //Print reverse string in java Program
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1 ; i >= 0 ; i-- )
            reverse = reverse + original.charAt(i);
        System.out.println("Reverse of entered string is: "+reverse);

    }
}
