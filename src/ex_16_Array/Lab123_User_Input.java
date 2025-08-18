package ex_16_Array;

import java.util.Scanner;

public class Lab123_User_Input {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array[int] only :- ");
        int size = sc.nextInt();

        int[] number_marks = new int [size];

        // float[] number_marks = new float[size];
        //String[] number_marks = newString[size];


        for (int i = 0; i < number_marks.length; i++) {
            System.out.println("Enter the number");
            number_marks[i] = sc.nextInt();
        }

        System.out.println("Below code is printing the element :-");

        for (int i = 0; i < number_marks.length; i++) {
            System.out.println(number_marks[i]);

        }
    }
}
