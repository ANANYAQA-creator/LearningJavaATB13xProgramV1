package ex_33_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map ;
import java.util.TreeMap;

public class Lab227_Map {
    public static void main(String[] args) {

        //MAP
  //Map m1 = new Map ();  // we cannot create a object of a map.
        Map m1 = new HashMap(20);
        // Map is a key value pair
        // name -> Ananya
        m1.put("name","Ananya");
        m1.put("roll no.",21);
        m1.put("Cell No.",956846625);
        m1.put(54,87);
        System.out.println(m1);

        //LinkedHashMap
        Map m2 = new LinkedHashMap();
        m2.put("name","Ananya");
        m2.put("roll no.",21);
        m2.put("Cell No.",956846625);
        System.out.println(m2);

        //TreeMap
        Map m3 = new TreeMap();
        m3.put("firstname","Ananya");
        m3.put("lastname","Rawte");
        m3.put("roll no.", 21);
        m3.put("cell no.", 985648465);
        System.out.println(m3);

    }
}
