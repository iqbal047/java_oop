package inheritance;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();

        t1.name = "Asaduzzaman";
        t1.age = 40;
        t1.qualification = "Bsc in Math";
        t1.displayInformation2();


        System.out.println("\n\n");

        Teacher t2 = new Teacher();
        t2.name="Ishrat Jahan";
        t2.age = 35;
        t2.qualification = "Bcom in Bangla";
        t2.displayInformation2();

    }
}
