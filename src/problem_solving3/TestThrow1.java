package problem_solving3;

public class TestThrow1 {
    //. How to throw exception in java Program
    static void validate(int age){
        if(age<18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("welcome to vote on TechIqbal");
    }
    public static void main(String args[]){
        validate(15);
        System.out.println("rest of the code...");
    }
}
