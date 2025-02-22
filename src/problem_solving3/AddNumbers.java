package problem_solving3;

import java.util.Scanner;

public class AddNumbers {
   // How to add two number Program in java
    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Enter two integers to calculate their sum ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("Sum of entered integers = "+z);
    }
}
