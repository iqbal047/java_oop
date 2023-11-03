package oop;

public class CallByValueTest {
    public static void main(String[] args) {

        CallByValue ob = new CallByValue();
        int x = 10;
        System.out.println("x before call : " + x);


        ob.change(x);
        System.out.println("x after call : "+ x);
    }
}
