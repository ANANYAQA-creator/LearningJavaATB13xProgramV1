package ex_07_Command_Line_Input_UserInput;

public class Lab052_Decrement_Pre_Post_Operator {
    public static void main(String[] args) {
        /*     Decrement Operator --
     prefix decrement Operator --a     first decrease the value by  1 then assign.
     postfix decrement Operator a--    first print then decrease the value by 1.
     */
        // Post-Decrement Operator  ;-first print then decrease the value by 1.

        int a = 10;
        int result_post = a--;
        System.out.println(result_post); // 10  // [Post decrement]a--  = 10 then decrease by 1 means a become 9.
        System.out.println(a); //9

        // Pre Decrement Operator  :- first decrease the value by  1 then assign.
        int b = 11;
        int result_pre = --b ;
        System.out.println(result_pre); //10  // (Pre Decrement)--b = first decrease the value by 1 means 10  then assign b= 10
        System.out.println(b); // 10


    }
}
