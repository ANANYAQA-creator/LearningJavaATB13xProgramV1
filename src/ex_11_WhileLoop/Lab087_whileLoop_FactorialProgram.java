package ex_11_WhileLoop;

import java.math.BigInteger;
import java.util.Scanner;

public class Lab087_whileLoop_FactorialProgram {
    public static void main(String[] args) {

        // Factorial Number :- Denoted by n!, The product of all positive integer less than or equal to n.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial number\n Enter the number");
        if (!scanner.hasNextInt()){
            System.out.println("Enter the Integer Value only");
            return;
        }
        int number  = scanner.nextInt();
        int factorial = 1;
       // BigInteger factorial =1 ;

        if (number <0 ){
            System.out.println("Negative Factorial is not allowed");
            return;
        }

        if (number <= 0){
            System.out.println(factorial);
        }else {
            // Calculate the Factorial of number
            for ( int i = 1; i <= number; i++) {
                factorial = factorial*i ;
            }
        }
        System.out.println("Factorial is -->" + factorial);  // Print the calculated Factorial
    }
}
