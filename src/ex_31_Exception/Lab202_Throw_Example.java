package ex_31_Exception;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab202_Throw_Example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :- ");
        int age = sc.nextInt();

        try {
            ValidAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static  void ValidAge(int age) throws ArithmeticException, FileNotFoundException {
        if(age < 18) {
            throw new ArithmeticException("You are minor.");
        }
    }
}
