package ex_09_Switch_Statement;

import java.sql.SQLOutput;

public class Lab066_interviewQA3 {
    public static void main(String[] args) {
// Q.1
        int a = 11;

        switch (-1) {
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;

            default:
                System.out.println("Not allowed");
                break;
        }
   //Q.2

        char code ='C' ;

        switch (code){
            default :
                System.out.println("Hello it's me");
                break;
            case 'A' :
                System.out.println(" I am A");
                break;
            case 'B' :
                System.out.println(" I am B");
                break;

        }

    }
}
