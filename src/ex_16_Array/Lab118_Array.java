package ex_16_Array;

public class Lab118_Array {
    public static void main(String[] args) {

        int a = 10;
        int[] marks ={90,91,98,94,85,96,97};  // Predefined Array

        System.out.println(marks.length); // 7
        System.out.println(marks[1]); // 91
        System.out.println(marks[5]); // 96
        System.out.println(marks[3]);  //94
        System.out.println(marks[10]);  // Error :- java.lang.ArrayIndexOutOfBoundsException

    }
}
