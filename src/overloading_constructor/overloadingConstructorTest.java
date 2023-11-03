package overloading_constructor;

public class overloadingConstructorTest {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();

        Teacher teacher2 = new Teacher("Anis", "male");
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher("Lisa","Female", 1732284565);
        teacher3.displayInformation();
    }
}
