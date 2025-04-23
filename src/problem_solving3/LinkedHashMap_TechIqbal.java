package problem_solving3;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_TechIqbal {
    //How to create LinkedHashMap program in java
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();

        hm.put(100,"Rajendra");
        hm.put(101,"Vijay");
        hm.put(102,"Technolamror");

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
