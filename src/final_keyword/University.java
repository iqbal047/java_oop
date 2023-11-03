package final_keyword;

public class University {
     final String UNIVERSITY_NAME = "NU";
//    final int fees;            //blank final varibale
    static final int fees;            //static blank final varibale

//    University(){              ////initialize blank final varibale
//        fees = 37000;
//    }

    static {                  //initialize static blank final varibale
        fees = 37000;
    }

    void display(){

        System.out.println(UNIVERSITY_NAME);
        System.out.println(fees);
    }


}
