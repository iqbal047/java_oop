package problem_solving3;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
    //How to write data in text file using java program
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("D:\\testout.txt");
            fout.write(65);
            fout.close();
            System.out.println("success.. by TechIqbal.");
        }catch(Exception e){System.out.println(e);}
    }
}
