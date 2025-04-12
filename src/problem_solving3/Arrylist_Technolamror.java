package problem_solving3;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrylist_Technolamror {
    //Create   ArrayList program  in java
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Rajendra");//Adding object in arraylist
        list.add("Mahendra");
        list.add("Raja");
        list.add("Technolamror");
        //Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
