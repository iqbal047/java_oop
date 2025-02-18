package problem_solving3;

import java.util.Scanner;

public class GetInputFromUser {
    public static void main(String[] args){
      //  How to get Using input using Scanner Program in java

        int a;
        float b;
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
        s = in.nextLine();
        System.out.println("Enter a String:" +s);

        System.out.println("Enter an Integer : ");
        a = in.nextInt();
        System.out.println("Enter an Integer : " +a);

        System.out.println("Enter a Float : ");
        b = in.nextFloat();
        System.out.println("Enter a float : " +b);
    }
}
