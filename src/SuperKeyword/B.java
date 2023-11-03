package SuperKeyword;

public class B extends A {
    // int x = 10 super class A value
    int x = 5;

    void display(){
//        System.out.println(x);      //print sub class variable
        System.out.println(super.x);      //print super class variable
    }


}
