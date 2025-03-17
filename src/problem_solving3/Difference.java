package problem_solving3;

public class Difference {
    //Difference between Static and Instance
    //method working in java Program
    public static void main(String[] args) {
        display(); //calling without object
        Difference t = new Difference();
        t.show(); //calling using object
    }
    static void display() {
        System.out.println("Programming is amazing.");
    }
    void show(){
        System.out.println("Java is awesome.");

    }
}
