package polymorphism;

public class Test {
    public static void main(String[] args) {

        Person p = new Person();
        p.display();

        p = new Teacher();
        p.display();

        p = new Student();
        p.display();



        //so eta kei Run time or dynamic polymorphism bole...
    }
}
