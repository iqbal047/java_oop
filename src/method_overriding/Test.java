package method_overriding;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Anis";
        t1.age = 27;
        t1.qualification = "Bsc in CSE";
        t1.displayInformation();


        Person p1 = new Person();
        p1.name = "Suparna";
        p1.age = 25;
        p1.displayInformation();
    }
}
