package ex_31_Exception;

import java.util.Scanner;

public class Lab194_try_catch_finally_Purpose {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int v = sc.nextInt();
        try{
            int b = 10/v;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println(" End of Program, execute only once");
        }


    }
}
