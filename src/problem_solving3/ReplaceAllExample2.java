package problem_solving3;

public class ReplaceAllExample2 {
    // How to replace string with another string in java Program
    public static void main(String[] args) {
        String s1="My name is Rajendra. My name is lamror. My name is Technolamror.";
        String replaceString=s1.replaceAll("is","was");//replaces all occurrences of "is" to"was"
        System.out.println(replaceString);

    }
}
