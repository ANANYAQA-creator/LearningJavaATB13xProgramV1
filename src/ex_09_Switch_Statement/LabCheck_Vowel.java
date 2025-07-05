package ex_09_Switch_Statement;

import java.util.Scanner;

public class LabCheck_Vowel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the single char");
        char ch = scanner.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " This is vowel");

                break;
            default:
                System.out.println(" this is consonant");
        }
    }
}
