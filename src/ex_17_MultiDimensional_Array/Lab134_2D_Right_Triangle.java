package ex_17_MultiDimensional_Array;

import java.util.Scanner;

public class Lab134_2D_Right_Triangle {
    public static void main (String[] args){

        // How we print the pattern with n=3.
        //*
        //**
        //***

        System.out.println("Enter the value of n, eg n=3");
        Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();

       for ( int i=0; i < n; i++){
           for (int j = 0; j <=i ; j++) {
               System.out.print("*");
           }
           System.out.println();
       }

        //***
        //**
        //*
        System.out.println("Enter the value for Opposite Pattern suppose n1=3");

       Scanner scanner1 = new Scanner(System.in);
       int n1 = scanner1.nextInt();
        for (int i = n1; i > 0 ; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
