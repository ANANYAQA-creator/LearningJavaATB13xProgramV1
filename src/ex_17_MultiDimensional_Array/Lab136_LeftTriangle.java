package ex_17_MultiDimensional_Array;

import java.util.Scanner;

public class Lab136_LeftTriangle {
    public static void main(String[] args) {

        //LEFT HAND TRIANGLE
        //***
        //**
        //*

        System.out.println("Enter the Value of n :-");
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();

        for (int i = n; i >= 1 ; i--) {
            for (int j=1; j <=i; j++){
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
