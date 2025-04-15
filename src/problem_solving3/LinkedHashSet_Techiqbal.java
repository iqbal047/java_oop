package problem_solving3;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_Techiqbal {
    //How to create LinkedHashSet program in java
    public static void main(String[] args) {
        LinkedHashSet<String> al=new LinkedHashSet<String>();

        al.add("Riaj");
        al.add("Adiat");
        al.add("Nawsish");
        al.add("TechIqbal");
        Iterator<String> itr=al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
