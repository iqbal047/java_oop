package oop;

public class RecursionFactorialDemoTest {
    public static void main(String[] args) {
        RecursionFactorialDemo ob = new RecursionFactorialDemo();

        ob.fact(5);
        int result = ob.fact(5);
        System.out.println("Factorial of 5 = "+ result);
    }
}
