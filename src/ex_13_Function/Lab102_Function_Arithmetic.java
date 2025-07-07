package ex_13_Function;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab102_Function_Arithmetic {
    // Create a Function of Sub, Sum, Mul, modulous and Div
    // with parameter, a, b (take the parameter from the User)

    // Logic Building
    // Step 1 -> Inputs and Outputs
    //  a, b - int -> Scanner
    //  int -> variable result ->

    // Step 2 - Rough logic -> Create functions
    // function -> type 4th - with return and with arguments/ parameters

    // Step 3 - Write the code and Find and Fix  -> Edge Cases
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a");
        //int a = scanner.nextInt();
        // for a = edge cases needed to add the below if else
        int a = 0;
        if(scanner.hasNextInt()) {
            a= scanner.nextInt();
        }else {
            System.out.println("Enter the integer value only");
        return;
        }


        System.out.println("Enter the value of b");
       // int b = scanner.nextInt();
        // for b = edge cases needed to add the below if else
        int b = 0;
        if(scanner.hasNextInt()) {
            b= scanner.nextInt();
        }else {
            System.out.println("Enter the integer value only");
            //return;
            System.exit(0);
        }

        /**
        * Substract of two number
         *
         *@param a value
         *@param b value
         *@return Substraction of a and b
         */
        int Sub= Substract(a,b);
        System.out.println(Sub);
        int Add= Sum(a,b);
        System.out.println(Add);
        int Divide= Division(a,b);
        System.out.println(Divide);
        int Remainder= Modulous(a,b);
        System.out.println(Remainder);
        int Multiply= Multiplication(a,b);
        System.out.println(Multiply);

    }

    static int Substract (int a,int b) {
        return a-b;
    }
    static int Sum (int a,int b) {
        return a+b;
    }
    static int Division (int a,int b) {
        if (b == 0) {
                throw new ArithmeticException("b cant be zero");
            }
            return a/b;
        }

    static int Modulous (int a,int b) {
        return a%b;
    }
    static int Multiplication (int a,int b) {
        return a*b;
    }
}
