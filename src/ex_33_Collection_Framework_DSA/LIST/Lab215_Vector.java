package ex_33_Collection_Framework_DSA.LIST;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Objects;
import java.util.Vector;

public class Lab215_Vector {
    public static void main(String[] args) {

        Vector v = new Vector();
        Vector v1 =new Vector();

        v1.add("Shiv");
        v1.add("Rawte");
        v1.add("Shivi1");
        System.out.println(v1);

        v.remove("Shiv");
        System.out.println(v1.contains("Shiv"));
        System.out.println(v1);

        System.out.println("-------------------");

        // using for loop
        System.out.println("For Loop");
        for (int i = 0; i < v1.size(); i++) {
            System.out.println(i);
        }

        // For Each loop
        System.out.println(" For Each loop");
        for (Object o : v1){
            System.out.println(o);
        }

        // Iterator
        System.out.println("Iterator :- Mostly used");
        Iterator iterator = v1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(" ----  Enumeration :-  not so much used in automation");

        Enumeration<Object> enumeration = v1.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

    }
}
