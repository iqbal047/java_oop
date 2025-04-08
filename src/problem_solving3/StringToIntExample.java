package problem_solving3;

public class StringToIntExample {
    //How to convert string to integer in java program
    public static void main(String[] args){
        String s="200";
        int i=Integer.parseInt(s);
        System.out.println(s+100);//200100 because + is string concatenation operator
        System.out.println(i+100);//300 because + is binary plus operator
    }
}
