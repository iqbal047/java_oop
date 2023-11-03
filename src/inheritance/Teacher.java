package inheritance;

public class Teacher extends Person {
    //name, age, displayInformation

    String qualification;


    void displayInformation2() {
       displayInformation1(); 
        System.out.println("Qualification : "+qualification);
    }
}
