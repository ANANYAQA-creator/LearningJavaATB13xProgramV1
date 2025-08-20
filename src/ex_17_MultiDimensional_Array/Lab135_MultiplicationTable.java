package ex_17_MultiDimensional_Array;

import java.util.Scanner;

public class Lab135_MultiplicationTable {
    public static void main(String [] args){

        System.out.println("Enter the size of the table :- ");
        Scanner scanner = new Scanner(System.in);
        int Size_of_Table = scanner.nextInt();

        for (int i = 0; i < Size_of_Table; i++) {
            for (int j = 0; j <Size_of_Table ; j++) {
                System.out.print(i*j + " | ");
            }
            System.out.println();
        }
    }
}
