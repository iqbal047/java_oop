package problem_solving3;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_TechIqbal {
    //92. How to create PriorityQueue program in java
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Rajendra");
        queue.add("Mahendra");
        queue.add("Raja");
        queue.add("Technolamror");
        queue.add("Rahul");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
