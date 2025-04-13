package problem_solving3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    ////How to ArrayList using list interface program in java
    public static void main(String[] args) {
        //Creating list of Books
        List<Book> list=new ArrayList<Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Java Program Questation","Rajendra","Technolamror",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        System.out.println("Original content of list is: ");
        //Traversing list
        for(Book b:list){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
        ListIterator<Book> itr=list.listIterator();
        System.out.println("Modified content of list in backward is: ");
        while(itr.hasNext()){
            Book st=(Book)itr.next();
            System.out.println(st.quantity+" "+st.publisher+" "+st.author+" "+st.name+" "+st.id);
        }
    }
}
