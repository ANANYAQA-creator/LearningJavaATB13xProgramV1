package ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab063_Duplicate_case {
    public static void main(String[] args) {

        // Duplicate case are not allowed

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day [1 to 7]");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            //     case 1 :                                             [Duplicate case are not allowed]
            //     System.out.println("tue");
            //     break ;
        }
    }
}
