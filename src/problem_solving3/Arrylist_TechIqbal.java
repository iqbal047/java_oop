package problem_solving3;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrylist_TechIqbal {
    //86 Create   ArrayList program  in java
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Md Iqbal Hossain");//Adding object in arraylist
        list.add("Nawsish");
        list.add("Adiat");
        list.add("TechIqbal");
        //Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
