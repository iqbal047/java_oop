package problem_solving3;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_technolamror {
    //How to create LinkedList program in java
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<String>();

        al.add("Rajendra");//Adding object in LinkedList
        al.add("Mahendra");
        al.add("Raja");
        al.add("Technolamror");

        Iterator<String> itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
