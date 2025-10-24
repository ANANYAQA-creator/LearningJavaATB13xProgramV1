package ex_33_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab210_ArrayList {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add("Ananya");
        arrayList.add(null);
        arrayList.add("Rawte");
        arrayList.add("Rawte"); // Duplicate is also allowed.
        arrayList.add(123); // Different data type is also allowed.
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l1 = new ArrayList();
        l1.add(123);
        l1.add("Shivv");
        l1.add("SRawte");
        l1.add(true);
        l1.add(null);
        System.out.println(l1);
        System.out.println(l1.isEmpty());

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());
    }
}
