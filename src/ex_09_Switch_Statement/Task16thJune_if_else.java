package ex_09_Switch_Statement;

import java.util.Scanner;

public class Task16thJune_if_else {
    public static void main(String[] args) {

        /*
         ✅ Triangle Classifier:Write a program that classifies a triangle based on its side lengths.
         Given three input values representing the lengths of the sides,
         determine if the triangle is equilateral (all sides are equal),
         isosceles (exactly two sides are equal),
         or scalene (no sides are equal).
         Use an if-else statement to classify the triangle.
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side 1");
        int side1 = scanner.nextInt();

        System.out.println("Enter the side 2");
        int side2 = scanner.nextInt();

        System.out.println("Enter the side 3");
        int side3 = scanner.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral Triangle [All sides are equal]");
        }
            else if ( side1==side2 || side1 == side3 || side2==side3) {
            System.out.println("Isoceles Triangle [Two sides are equal]");
        }
            else {
                System.out.println("Scalne [No sides are Equal]");
            }



    }
}
