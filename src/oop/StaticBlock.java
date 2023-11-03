package oop;

public class StaticBlock {

    static int id;
    static String name;


    static { // it's static block
//        System.out.println("Static block");

        id = 101;
        name = "Anis";
    }

    static void display(){
        System.out.println("Id = "+ id);
        System.out.println("Name = "+ name);
    }

    public static void main(String[] args) {

//        System.out.println("main method");

        StaticBlock.display();
    }

}
