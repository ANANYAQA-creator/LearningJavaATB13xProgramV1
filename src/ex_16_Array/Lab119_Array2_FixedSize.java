package ex_16_Array;

public class Lab119_Array2_FixedSize {

    public static void main (String args[])
    {
        // 1st way to create array - Predefined Array
        int[] marks = {10, 9, 7, 5, 4, 6, 1}; // Predefined Array

        // 2nd way to create array - Fixed Array
        int[] marks1 = new int[5];    // size - 5 and index - 0,1,2,3,4
        String[] names = new String[3]; // size - 3 and index - 0,1,2
        names[0] = "Anay";
        names[1] = "Ajay";
        names[2] = "Ankit";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

    }
}