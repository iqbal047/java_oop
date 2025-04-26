package problem_solving3;

public class StaticBlock1 {
    //44 How Static block working in java Program
    //Static Block Application …. We need to open Program in speciif window
    public static void main(String[] args) {
        System.out.println("You are using Windows_NT operating system.");
    }
    static {
        String os = System.getenv("OS");
        if (os.equals("Windows_NT") != true) {
            System.exit(1);
        }

    }
}
