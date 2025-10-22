package ex_32_Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab207_Generic_Lists {
    public static void main(String[] args) {

        List normalList = new ArrayList<>();
        normalList.add(10);
        normalList.add("Shiv");
        normalList.add(true);
        normalList.add(23.5);

// When only needed to add integer.
        List<Integer> integerlist = new ArrayList();
        integerlist.add(12);
     //   integerlist.add("Shiv");  // Not able to add String here.

        // List - Collection Framework ->collection of items -> 12,3, pramd, dutta.
    }
}