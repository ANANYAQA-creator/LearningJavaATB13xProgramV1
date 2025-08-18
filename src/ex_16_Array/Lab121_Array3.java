package ex_16_Array;

import java.util.Arrays;

public class Lab121_Array3 {
    public static void main (String [] args) {

        int [] marks = {10,9,8,6,7,5};
        System.out.println("----------");

       for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("Marks are sort :- ");

        Arrays.sort(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
