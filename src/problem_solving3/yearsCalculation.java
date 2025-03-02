package problem_solving3;

import java.util.Scanner;

public class yearsCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();

        int years = days / 365;
        days = days % 365;
        int months = days / 30;
        days = days % 30;
        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " dia(s)");
        sc.close();
    }
}
