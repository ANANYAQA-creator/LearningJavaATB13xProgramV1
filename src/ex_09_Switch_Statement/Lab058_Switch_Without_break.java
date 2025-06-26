package ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab058_Switch_Without_break {
    public static void main(String[] args) {

        // Switch without break execute all the data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day [1 to 7]");
        int day = scanner.nextInt();

        switch (day) {
            case 1 :
                System.out.println("Mon");
            case 2 :
                System.out.println("tue");
            case 3 :
                System.out.println("Wednes");
            case 4 :
                System.out.println("Thurs");
            case 5 :
                System.out.println("Fri");
            case 6 :
                System.out.println("Sat");
            case 7 :
                System.out.println("Sun");
            default:
                System.out.println("Not Allowed");

/* o/p
Enter the day [1 to 7]
4
Thurs
Fri
Sat
Sun
Not Allowed
 */

        }
    }
}
