package overloading_constructor;

public class Teacher {
    String name, gender;
    int phone;



//    Overloading Constructor
    Teacher(){

        System.out.println("No Information");
    }

    Teacher(String n, String g ){
        name = n;
        gender = g;
    }

    Teacher(String n, String g, int p){
        name = n;
        gender = g;
        phone = p;
    }

    void displayInformation(){
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);
        System.out.println("\n\n");
    }
}
