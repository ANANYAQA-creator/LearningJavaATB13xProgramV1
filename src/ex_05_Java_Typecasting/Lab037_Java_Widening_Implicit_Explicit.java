package ex_05_Java_Typecasting;

public class Lab037_Java_Widening_Implicit_Explicit {
    public static void main(String[] args) {

        /* Type Casting - convert a value from one datatype to another datatype .
        Only allowed in compatible data types.

         There are two types of casting
         1. Widening - Implicit and Explicit
         2. Narrowing - Implicit and Explicit

       *   Widening - also known as implicit casting, convert a value from small datatype to large datatype
         */

        // Implicit Widening = convert a value from small datatype to large datatype
    byte a = 10;
    int d = a;  // valid implicit casting --> widening

        System.out.println(a);
        // Explicit Widening = convert a valur from large datatype to small datatype

        byte b = 10;
        int a1= (int)b;  // valid explicit casting  -->widening
        System.out.println(a1);


    }
}
