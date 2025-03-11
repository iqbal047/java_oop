package problem_solving3;

public class SplitExample {
    // How to split string in java Program
    public static void main(String[] args) {
        String s1="java string split method by Technolamror";
        String[] words=s1.split("\\s");//splits the string based on whitespace
//using java foreach loop to print elements of string array
        for(String w:words){
            System.out.println(w);
        }

    }

}
