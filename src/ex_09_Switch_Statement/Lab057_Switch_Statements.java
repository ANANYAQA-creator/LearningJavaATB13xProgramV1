package ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab057_Switch_Statements {
    public static void main(String[] args) {

        /* Syntax
        switch(expression) {

        Case statements
        Value must be of same type of expression
        case value1 :expression =value 1  -->
        Statements
        break;    // break is optional
        case value 2 :
        //Statements
        break ;   // break is optional
        default :
        break ;
        }
         */

        // Take a user input and tell them the day they have told .
        // eg 1 to 7. 1= Mon , 4= Thurs
        // 8 = Not allowed or Error

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day [1 to 7]");
        int day = scanner.nextInt();

        switch (day) {
            case 1 :
                System.out.println("Mon");
                break ;
            case 2 :
                System.out.println("tue");
                break ;
            case 3 :
                System.out.println("Wednes");
                break ;
            case 4 :
                System.out.println("Thurs");
                break ;
            case 5 :
                System.out.println("Fri");
                break ;
            case 6 :
                System.out.println("Sat");
                break ;
            case 7 :
                System.out.println("Sun");
                break ;
            default:
                System.out.println("Not Allowed");
                break;

        }
    }
}
