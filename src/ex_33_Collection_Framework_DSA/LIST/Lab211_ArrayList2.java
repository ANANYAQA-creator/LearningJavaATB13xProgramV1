package ex_33_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab211_ArrayList2 {
    public static void main(String[] args) {

        List l = new ArrayList();

        List l1 = new ArrayList(10);

        l1.add(1) ;//0 index
        l1.add(2) ; //1 index
        l1.add(3); // 2 index
        l1.add(true); // 3
        l1.add( "Shiv"); //4
        l1.add(5); // 5 index
        l1.add("1"); // 6 index

        System.out.println(l1.size());
        System.out.println(l1.isEmpty());
        System.out.println(l1.contains(1));
        System.out.println(l1.contains("1"));

        // Returns the index of the first occurrence of the specified element in this list,

        System.out.println(l1.indexOf(3));
        System.out.println(l1.lastIndexOf(5));
        System.out.println(l1);

        // Using For Loop

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(i);
        }

        // Using For each loop

        for (Object o: l1) {
            System.out.println(o);
        }

        l1.set(1,56);
        System.out.println(l1);

        l1.remove(0);
        System.out.println(l1); // Remove element at index 0

        l1.clear();
        System.out.println(l1);
    }
}
