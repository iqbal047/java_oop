package problem_solving3;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Techiqbal {
    // 91. How to create TreeSet program in java
    public static void main(String[] args) {
        //Creating and adding elements
        TreeSet<String> al=new TreeSet<String>();
        al.add("Rajendra");
        al.add("Raja");
        al.add("Ravi");
        al.add("Technolamror");  //ments
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
