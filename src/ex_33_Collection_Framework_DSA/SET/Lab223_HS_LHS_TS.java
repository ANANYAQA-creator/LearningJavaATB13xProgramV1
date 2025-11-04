package ex_33_Collection_Framework_DSA.SET;

import java.util.* ;
public class Lab223_HS_LHS_TS {
    public static void main(String[] args) {

        // HASHSET

        Set<String> hs = new HashSet<>();
        // Hashing mechanism to store the element
        // no order maintained
        // no duplicates
        // e1 -> hashcode (xyz), e2 -> hashcode -> abc

        hs.add("Apple");
        hs.add("Grapes");
        hs.add("Watermelon");
        hs.add("Watermelon");   // duplicated ignored
        System.out.println(hs);  // [Apple, Grapes, Watermelon]
        System.out.println("-------------------------------------------");
        //hs.add(123);
        hs.add(null);
        //hs.add(null);  // Only one null is allowed
        System.out.println(hs); // [null, Apple, Grapes, Watermelon]
        System.out.println("-------------------------------------------");
        for (String s : hs){
            System.out.println(s);
        }

        System.out.println("-------------------------------------------");

        // Using Iterator
        Iterator iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-------------------------------------------");

        // LINKED HASHSET
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates


        Set<String> lhs = new LinkedHashSet();
        lhs.add("Pineapple");
        lhs.add("Guava");
        lhs.add("berry");
        lhs.add("berry"); //duplicates ignored
  //      lhs.add(123);
        lhs.add(null);
  //      lhs.add(null);
        System.out.println(lhs); //[Pineapple, Guava, berry, null]
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.size());
        System.out.println(lhs.contains("Apple"));

        System.out.println("-------------------------------------------");

        // TREESET

        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        // Natural Sorting - ASCII values.

        Set<String> ts = new TreeSet<>();
        ts.add("Apple"); // duplicates not allowed
        ts.add("Apple");
        ts.add("Mango");
        ts.add("Banana");
        ts.add("Grapine");
        ts.add("Litchi");
        //ts.add(null)   // not allowed
        //ts.add(123);

        System.out.println(ts);
        System.out.println("------For Each----------");

        for (Object o : ts){
            System.out.println(o);
        }
    }
}
