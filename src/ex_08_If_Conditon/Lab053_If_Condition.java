package ex_08_If_Conditon;

import java.util.Scanner;

public class Lab053_If_Condition {
    public static void main(String[] args) {
       /*
        If (Conditional Statement) :- Decision making in Programming
        1. Only If
        2. If-else
        3. If with elseIf, else

   Basic Syntax
    Condition : 1. o/p should be boolean [True or False]
                2. It will give result either in 'True' or 'False'  --> Result datatype

                If(condition) {
                // code to be executed if condition is true
                }
                else {13
                // do this execution
                }

    Disadvantages :-
    1. If we have multiple conditions then if-else --> complex.
    2. Break and continue keywords can't be used with if- else condition.
    */
        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if ( age > 18) {
            System.out.println( "Allowed to vote");
        }

    }
}
