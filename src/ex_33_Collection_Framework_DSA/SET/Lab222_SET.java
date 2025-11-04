package ex_33_Collection_Framework_DSA.SET;

import java.util.*;

public class Lab222_SET {
    public static void main(String[] args) {

        //HASHSET
// in hashset duplicates not allowed
        Set hs = new HashSet();

        hs.add("Ananya");
        hs.add("Ananya"); // duplicates ignored
        hs.add("Rawte");
        System.out.println(hs);  // [Ananya, Rawte]

        // LinkedHashset

        Set lhs = new LinkedHashSet();

        //TreeSet
        Set Ts = new TreeSet();

    }
}
