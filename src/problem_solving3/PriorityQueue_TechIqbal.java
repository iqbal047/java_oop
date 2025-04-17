package problem_solving3;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_TechIqbal {
    //92. How to create PriorityQueue program in java
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Nazmul");
        queue.add("Adiat");
        queue.add("Riaj");
        queue.add("Techiqbal");
        queue.add("Nawsish");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
