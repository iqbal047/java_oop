package Static_variable;

public class Student { //Static variable3

    static int count = 0;    //non static variable


    Student(){
        count++;
    }

    void totalStudent(){
        System.out.println("Total student = "+ count);
    }
}
