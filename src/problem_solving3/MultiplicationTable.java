package problem_solving3;

import java.util.Scanner;

public class MultiplicationTable {
    //25 Print Multiplication table Program in java
    public static void main(String[] args) {
        int n, c;
        System.out.println("Enter an integer to print it's multiplication table");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Multiplication table of "+n+" is :-");
        for ( c = 1 ; c <= 10 ; c++ )
            System.out.println(n+"*"+c+" = "+(n*c));
    }
}
