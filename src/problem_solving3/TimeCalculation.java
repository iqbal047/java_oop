package problem_solving3;

import java.util.Scanner;

public class TimeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int hours, minutes;
        hours = seconds / 3600;
      //  seconds = seconds % 3600;
        minutes = seconds / 60;
        seconds = seconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
        sc.close();
    }
}
