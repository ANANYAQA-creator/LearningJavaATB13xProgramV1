package ex04_Java_Operators;

public class Lab026_Java_Relational_Operator {
    public static void main(String[] args) {

        /*  Relational Operator
         <   - Less than
         <=  - Less than equal to
         > - Greater than
         >= - Greater than equal to
         == - for compare the value
         =  - for define the variable_value to variable_name
        != -  not equal to

         All the above result will  be boolean input
         */

        int a = 10;
        int  b = 20;
        boolean r= a>b ;
        boolean r2 = a>=b;
        System.out.println(r);
        System.out.println(r2);
        int Shivam_age = 25;
        int Shiv_age = 28;
        boolean r1 =  Shivam_age < Shiv_age;
        boolean r4 = Shivam_age >= Shiv_age ;
        System.out.println( r1);
        System.out.println( r4);

    }
}
