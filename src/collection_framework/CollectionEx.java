package collection_framework;

import java.util.*;

public class CollectionEx {
    public static void main(String[] args) {





        List arrayList = new ArrayList();
        arrayList.add("arrayList");
        arrayList.add("rayhan");
        arrayList.add("rafa");
        arrayList.add("rayhan");
        arrayList.add("ashfaq");
        print(arrayList);



        List linkedList = new LinkedList();
        linkedList.add("linkedList");
        linkedList.add("rayhan");
        linkedList.add("rafa");
        linkedList.add("rayhan");
        linkedList.add("ashfaq");
        print(linkedList);


        List vector = new Vector();
        vector.add("vector");
        vector.add("rayhan");
        vector.add("rafa");
        vector.add("rayhan");
        vector.add("ashfaq");
        print(vector);


        List stack = new Stack();
        stack.add("stack");
        stack.add("rayhan");
        stack.add("rafa");
        stack.add("rayhan");
        stack.add("ashfaq");
        print(stack);









        Set hashset = new HashSet();
        hashset.add("Hashset");
        hashset.add("Rajib");
        hashset.add("Rasel");
        hashset.add("Rajib");
        hashset.add("Sajib");
        print(hashset);



        Set linkedhashset = new LinkedHashSet();
        linkedhashset.add("LinkedHashSet");
        linkedhashset.add("Rajib");
        linkedhashset.add("Rasel");
        linkedhashset.add("Rajib");
        linkedhashset.add("Sajib");
        print(linkedhashset);




        Set treeset = new TreeSet();
        treeset.add("TreeSet");
        treeset.add("Rajib");
        treeset.add("Rasel");
        treeset.add("Rajib");
        treeset.add("Sajib");
        print(treeset);









        Map<String, String> hashTable = new Hashtable<>();
        hashTable.put("name", "Zahabgir");
        hashTable.put("roll", "100");
        hashTable.put("dept", "CSE");
        print(hashTable.keySet());
        print(hashTable.values());




        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Zahabgir");
        hashMap.put("roll", "100");
        hashMap.put("dept", "CSE");
        print(hashMap.keySet());
        print(hashMap.values());




        Map<String, String> linkedhashMap = new LinkedHashMap<>();
        linkedhashMap.put("name", "Zahabgir");
        linkedhashMap.put("roll", "100");
        linkedhashMap.put("dept", "CSE");
        print(linkedhashMap.keySet());
        print(linkedhashMap.values());




        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("name", "Zahabgir");
        treeMap.put("roll", "100");
        treeMap.put("dept", "CSE");
        print(treeMap.keySet());
        print(treeMap.values());


    }

    private static void print(Collection collection){
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            String value = (String) iterator.next();
            System.out.println(value);
            System.out.println();
        }
        System.out.println("=================");
    }
}
