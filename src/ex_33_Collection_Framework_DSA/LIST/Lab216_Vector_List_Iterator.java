package ex_33_Collection_Framework_DSA.LIST;
import com.sun.source.tree.WhileLoopTree;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab216_Vector_List_Iterator {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        v.add("Item1");
        v.add("Item2");
        v.add("Item3");
        v.add("Item4");
        v.add("Item5");

        // Using ListIterator

        ListIterator listIterator = v.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        // ListIterator have previous.
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        // Using iterator
        // Iterator cannot have a previous while ListIterator have previous.

        Iterator iterator = v.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            
        }
    }
}
