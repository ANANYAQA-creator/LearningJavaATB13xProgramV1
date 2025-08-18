package ex_16_Array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Lab122_Array_Max_Min {

    public static void main(String[] args) {
        int[] array = {56, 58, 60, 64, 68, 69, 70, 31, 28, 25};   // indexation works from 0 to 9 and length starts from 1 to 10.

        /*
        // METHOD- 1 but lengthy and not suggested to use.

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        System.out.println("Sorting of Number :-");
        Arrays.sort(array);
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }
        //MAXIMUM NUMBER
        System.out.println("Maximum Number in array:- ");
        System.out.println(array[array.length-1]);

        // MINIMUM NUMBER
        System.out.println("Minimum Number in array:- ");
        Arrays.sort(array);
        for (int i = 0; i < array.length ; i--) {
            System.out.println(array[i]);
        }
        System.out.println(array[array.length+1]);

        // METHOD-2  To find max and min
//MAX
        int max_output = give_me_max(array);
        System.out.println(max_output);
    }
        static int give_me_max ( int[] array)
        {
            int max = array[0] ;
            //LOGIC
            for (int i = 0; i < array.length ; i++) {
                if (array[i] > max ){
                    max = array[i];
                }
            }
            return max;
        */

        // MIN

        int min_output = give_me_min(array);
        System.out.println(min_output);
    }

    static int give_me_min(int[] array) {

        int min = array[0];
        //LOGIC
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
