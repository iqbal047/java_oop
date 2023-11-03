package Static_method;

public class StaticMethod {


    static int x = 10;
    void display1(){
        System.out.println(x);
        System.out.println("i am non static method");
    }

    static void display2(){

        System.out.println(x);
        System.out.println("i am static method");
    }
}
