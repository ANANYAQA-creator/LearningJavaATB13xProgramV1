package ex_07_Command_Line_Input_UserInput;

import java.util.Scanner;

public class Lab048_UserInput_Scanner_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;  // Important
        System.out.println("Enter the age");
        int age = scanner.nextInt(); ;
        String CanIVote = age >18 ? "Yes" : "No" ;
        System.out.println(CanIVote);
    }
}
