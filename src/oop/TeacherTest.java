package oop;

public class TeacherTest {
    public static void main(String[] args) {

//        Teacher teacher1 ----> object declare
//        teacher1 = new Teacher()   ----> object create

        Teacher teacher1 = new Teacher("Anisul Islam","male",1537420775);           //object create
//        teacher1.setInformation("Anisul Islam","male",1537420775 );   //Object initialized
        teacher1.displayInformation();


//        create another object
        Teacher teacher2 = new Teacher("Yeasir Arafath","male",1623940522);
//        teacher2.setInformation("Yeasir Arafath","male",1623940522);
        teacher2.displayInformation();



//        create another object
        Teacher teacher3 = new Teacher();
        teacher3.displayInformation();



    }
}
