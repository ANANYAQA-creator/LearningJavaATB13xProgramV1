package ex_12_While_Vs_DoWhile_Loop;

import java.util.Scanner;

public class Lab093_Vowel_or_Not {
    public static void main(String[] args) {

        //  To check if a character is a vowel in Java
        //ch == aieou ->
        //-  User will enter a character.
        //-  You will check by using if-else loop and give that if the character is a vowel or a consonant.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the single Char :");
        char ch = scanner.next().toLowerCase().charAt(0);

        if (ch == 'a'||ch =='e' || ch == 'i' || ch== 'o' || ch== 'u') {
            System.out.println( ch + " = This is vowel");
        } else if  (ch >'a' && ch <='z'){
            System.out.println("This is consonant");
        } else {
            System.out.println("Invalid Character");
        }

    }
}
