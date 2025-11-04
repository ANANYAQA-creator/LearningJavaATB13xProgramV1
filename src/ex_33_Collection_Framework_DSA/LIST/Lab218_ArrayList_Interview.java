package ex_33_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab218_ArrayList_Interview {
    public static void main(String[] args) {

        List marks = new ArrayList<>();
        marks.add(98);
        marks.add(65);
        marks.add(72);
        marks.add(55);
        System.out.println(marks);

        // Collection is interface
        // Collections is class(it contains complete methods which list,set, queue may required)

        Collections.sort(marks);
        System.out.println(marks);

        Collections.sort(marks, Collections.reverseOrder());
        System.out.println(marks);


    }
}
