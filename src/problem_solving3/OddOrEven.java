package problem_solving3;

import java.util.Scanner;

public class OddOrEven {
    //How to check Odd and Even Number in java.
    public static void main(String[] args) {
        int x;
        System.out.println("Enter an integer to check if it is odd or even ");
        Scanner in = new Scanner(System.in);
        x =in.nextInt();
        if(x % 2 ==0)
            System.out.println("You Entered an even number");
        else
            System.out.println("you entered an odd number");
    }
}
