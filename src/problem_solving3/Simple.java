package problem_solving3;

public class Simple implements Info {
    public static void main(String []args) {
        Simple obj = new Simple();
        obj.display();
    }
    // Defining method declared in interface
    public void display() {
        System.out.println(language + " is awesome");
    }

}
