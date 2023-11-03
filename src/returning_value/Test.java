package returning_value;

public class Test {
    public static void main(String[] args) {

        ReturningValueDemo ob1 = new ReturningValueDemo();
//        int result = ob1.square(5);
//        System.out.println("Square of 5 = "+ result);
        System.out.println("Square of 5 = "+ob1.square(5));



//create another object
        ReturningValueDemo ob2 = new ReturningValueDemo();
        System.out.println("Square of 6 = "+ob2.square(6));

    }
}
