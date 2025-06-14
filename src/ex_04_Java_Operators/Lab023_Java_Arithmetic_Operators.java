package ex_04_Java_Operators;

public class Lab023_Java_Arithmetic_Operators {

    public static void main(String[] args) {

        /* Arithmetic Operators
        + 'Addition'
        - 'Substraction'
        * 'Multiplication'
        / 'Division'
        %  'Modulus' also known as 'Remainder'
         */

        int a= 100;
        int b= 20;

        float c =23.00f;
        float d = 3.00F;

        System.out.println(a+b);   //120
        System.out.println(a-b);  // 80
        System.out.println(a*b);  // 2000
        System.out.println(a/b);  // 5
        System.out.println(c/d);  // 7.6666
        System.out.println(c%d);  // 2.0
        System.out.println(a%b);  // 0

    }
}
