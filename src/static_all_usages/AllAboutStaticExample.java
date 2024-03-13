package static_all_usages;

import static java.lang.Math.sqrt;

public class AllAboutStaticExample {
    public static int num;         //static variable

    static {
        num = 4;                //static block
        System.out.println("I am a static block");
    }

    public static void m1(){           //static method
        System.out.println("I am a static method");
    }

    public static void main(String[] args) {      //main method
        System.out.println("Using static Import :" +sqrt(num));
        System.out.println("I am main() method");
    }

    static class MyStaticClass {     //static inner class
        public static void main(String[] args) {
            System.out.println("I am inside static class");
        }
    }

    interface Java8Interface{    //static method inside interface
        static void m2(){
            System.out.println("I am inside an interface");
        }
    }
}
