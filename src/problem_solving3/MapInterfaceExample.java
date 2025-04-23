package problem_solving3;

import java.util.Map;
import java.util.HashMap;

public class MapInterfaceExample {
    // 93. How to create HashMap using map interface program in java
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Riaj");
        map.put(101,"Nawsish");
        map.put(102,"Techiqbal");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());

        }
    }
}
