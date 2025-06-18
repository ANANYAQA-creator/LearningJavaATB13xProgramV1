package ex_07_Command_Line_Input_UserInput;

public class Lab046_User_Input_using_CLI {
    public static void main(String[] args) {

        // using Ternary Operator for user input CLI(Command Line)
        //int age = 65;
        String age_string = args[0];
        int age = Integer.parseInt(age_string) ;
        System.out.println(age_string);
        String CanIVote = age >18 ? "Yes" : "No" ;
        System.out.println(CanIVote);
    }
}
