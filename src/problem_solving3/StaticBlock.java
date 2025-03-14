package problem_solving3;

public class StaticBlock {
    //How Static block working in java Program
    public static void main(String[] args) {
        System.out.println("Main method is executed.");
    }
    static {
        System.out.println("Static block is executed before main method.");
    }
}
