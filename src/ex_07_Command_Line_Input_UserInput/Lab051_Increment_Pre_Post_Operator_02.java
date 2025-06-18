package ex_07_Command_Line_Input_UserInput;

public class Lab051_Increment_Pre_Post_Operator_02 {
    public static void main(String[] args) {

        // int a = 10;
        // System.out.println(a++ + a);  // Post increment -  A[a++(10)] + B [11]  :- 21
        // A+ B [Divide and rule]
        // A --> a++ -(Expression of A) --> 10, then a = 11;
        // +
        // B = a = 11
        // A[a++(10)] + B [11]  :- 21

        int b = 20;
        System.out.println(b++ + ++b);   // Post increment + pre increment
        System.out.println(b);

        // A+B  :- 20 + 22  = 42
        // A --> b++  = 20(Expression of A) --> b = 21
        // B --> ++b =22  ---> 22(b)

int c= 30;
        System.out.println( ++c + ++c);  //63
        System.out.println(c);   // 32

        //A+B  :- 31 + 32 = 63
        // A --> ++c --> 31(exp of A) c--> 31
        // B --> ++c --> 32(exp of B) c-->32

        }
}
