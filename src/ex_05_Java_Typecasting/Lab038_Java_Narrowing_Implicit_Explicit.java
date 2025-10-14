package ex_05_Java_Typecasting;

import java.sql.SQLOutput;

public class Lab038_Java_Narrowing_Implicit_Explicit {
    public static void main(String[] args) {

        // Narrowing = Convert a value from large datatype to small datatype

        double d = 500.600;
        //int a = (int) d;
        int a = 300;
        // byte b = a;   // Narrowing :- Implicit casting is not allowed in the narrowing.
        byte b1= (byte)a; // Narrowing :- Explicit casting is allowed in the narrowing.
        // Data loss also occur.

        System.out.println(b1);

    }
}
