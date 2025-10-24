package ex_33_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab214_LinkedList3 {
    public static void main(String[] args) {

        List l = new ArrayList(); // Array List - continous format

        List l1 = new LinkedList();  // Linked List - Doubly Linked List[Random Memory]

        l1.add("Shiv");
        l1.add("adidas");
        l1.add("Rawte");
        l1.add("MMDS");
        l1.add(1906);
        l1.add(true);
        l1.add(56.12);
        l1.add(null);
        System.out.println(l1);

        System.out.println(l1.isEmpty());
        System.out.println(l1.size());
        System.out.println(l1.contains("Rawte"));
        System.out.println(l1.indexOf("Rawte"));
        System.out.println(l1.get(0));

        Iterator iterator =  l1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
