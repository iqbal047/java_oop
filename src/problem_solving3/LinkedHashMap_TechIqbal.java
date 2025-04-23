package problem_solving3;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_TechIqbal {
    //94 How to create LinkedHashMap program in java
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();

        hm.put(100,"Riaj");
        hm.put(101,"Adiat");
        hm.put(102,"TechIqbal");

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
