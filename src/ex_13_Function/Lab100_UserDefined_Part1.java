package ex_13_Function;

public class Lab100_UserDefined_Part1 {
        /* User Defined Functions
         a.  Without Parameters and without Return types.
         b.  Without Parameters but with Return types.
         c.  With Parameters and without Return types.
         d.  With Parameters and with Return types. */

    public static void main(String[] args) {
// Step2 :- Function Call
        //a.  Without Parameters and without Return types.
        WP_WR_Greet();

        // b.  Without Parameters but with Return types.
        String GreetReply = Wp_withReturnType_GreetReply();
        System.out.println(GreetReply);

        //c.  With Parameters and without Return types.

        WithP_WithoutReturntype ("Shiv",24,24);

        //d.With Parameters and with Return types.

       int M_Result= Multiplication_of_twoNumbers(4,6);
        System.out.println(M_Result);

    }
// Step1 :-  Function defination

    //A.  Without Parameters and without Return types.
    static void WP_WR_Greet() {
        System.out.println("----Type1 = Without Parameters and without Return types.----");
        System.out.println(" P1 :- Hi, Good Morning, How are you ?");
    }

    // B.  Without Parameters but with Return types.
    static String Wp_withReturnType_GreetReply() {
        System.out.println("----Type2 = Without Parameters but with Return types.----");
        System.out.println(" P2 :- Hello");
        return "I am fine, What about you ?" ;
    }
    //C.  With Parameters and without Return types.

    static void WithP_WithoutReturntype( String Name ,  int age , int Salary) {
        System.out.println("----Type3 :- With Parameters and without Return types.-----");
        System.out.println( "My name is "+Name +"\nMy Age is " +age + "\nMy salary is " +Salary);
    }

    //D.With Parameters and with Return types.

    static int Multiplication_of_twoNumbers ( int a, int b) {
        System.out.println("----Type4 :- With Parameters and with Return types.-----");
        return a*b ;
    }
}