package problem_solving3;

import java.util.HashSet;
import java.util.Iterator;

public class TestCollection9 {
    // How to create Hashset program in java
    public static void main(String[] args) {
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("Rajendra");
        set.add("Raja");
        set.add("Ravi");
        set.add("Technolamror");
        //Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
