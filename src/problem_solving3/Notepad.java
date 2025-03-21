package problem_solving3;

import java.io.IOException;

public class Notepad {
    //How to open notepad in java Program
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();
        try {
            rs.exec("notepad");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
