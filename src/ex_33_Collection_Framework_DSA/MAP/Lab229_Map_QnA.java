package ex_33_Collection_Framework_DSA.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab229_Map_QnA {
    public static void main(String[] args) {

        Map m1 = new HashMap();
        m1.put("id",1);
        m1.put("id",2);
        m1.put("id2",2);
        m1.put("id3",24);
        m1.put("id6",34);
        m1.put("id4",null);  // null values allowed,
        m1.put("id5",null);  //multiple null values also allowed
        m1.put("null","testing");   // one null key allowed, multiple null key is not allowed

        System.out.println(m1);
        System.out.println(m1.size());
        System.out.println(m1.isEmpty());
        System.out.println(m1.containsKey("id2"));
        System.out.println(m1.containsValue(24));
        System.out.println(m1.keySet());
        System.out.println(m1.values());
        System.out.println(m1.get("id4"));
        System.out.println(m1.remove("id6"));
        System.out.println(m1);
    }
}
