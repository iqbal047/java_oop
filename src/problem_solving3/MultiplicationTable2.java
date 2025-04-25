package problem_solving3;

import java.util.Scanner;

public class MultiplicationTable2 {
    //25 Print Multiplication table Program in java(For Any Number)
    public static void main(String[] args) {
        int a, b, c, d;
        System.out.println("Enter range of numbers to print their multiplication table");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        for (c = a; c <= b; c++) {
            System.out.println("Multiplication table of "+c);
            for (d = 1; d <= 10; d++) {
                System.out.println(c+"*"+d+" = "+(c*d));
            }
        }


    }

}
