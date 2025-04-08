package problem_solving3;

public class IntToStringExample1 {
    //How to convert integer to string in java program
    public static void main(String[] args){
        int i=200;
        String s=String.valueOf(i);
        System.out.println(i+100);//300 because + is binary plus operator
        System.out.println(s+100);//200100 because + is string concatenation operator
    }
}

