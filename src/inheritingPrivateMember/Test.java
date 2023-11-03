package inheritingPrivateMember;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();

        t1.setName("Anisul");
        t1.setAge(27);
        t1.setQualification("BSc in CSE");
        t1.displayInformation();



        Teacher t2 = new Teacher();
        t2.setName("Rezaur");
        t2.setAge(26);
        t2.setQualification("BSc in CSE");
        t2.displayInformation();


    }
}
