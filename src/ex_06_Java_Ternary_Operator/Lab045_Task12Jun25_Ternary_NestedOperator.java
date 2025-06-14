package ex_06_Java_Ternary_Operator;

public class Lab045_Task12Jun25_Ternary_NestedOperator {

    public static void main(String[] args) {
      //  1 TERNARY OPERATOR PROGRAMS
        /*
     🔹Program 1: Find Max of Two Numbers using Ternary Operators.
       Description: Uses ternary operator to compare a and b and print the maximum value.A =10, B= 20;


        int A = 10;
        int B= 20;

        int Resultmax = A>B ? A:B ;
        System.out.println(Resultmax);
-----------------------------------------------------------------------------------------------------------*/

       /* 🔹 Program 2: Check Even or Odd.
       Description: Uses ternary to check whether a number is even or odd. A = 19, update the a value and check again A =20;
    */
          /*   int A = 19 ;
             String ResultEvenorOdd = (A%2 == 0) ? "Even" : "Odd" ;
        System.out.println(ResultEvenorOdd);   // Odd for 19

         int A1 = 20;
        String ResultEvenorOdd_UpdateValue = (A1%2 == 0) ? "Even" : "Odd" ;
        System.out.println(ResultEvenorOdd_UpdateValue);   // Even for 20

        */
        /*🔹Program 3: Grade Calculation Using Nested Ternary
        Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail
        Step 1 : I :-  marks --> 90 -->A+ ,
                       marks -->75 -->A ,
                       marks--->60-->B,
                       marks --->40-->C ,
                       C >40 ---> fails     int,
         O :- Grade calculate for obtained marks    String
         */
        /*
        Step 2 :- Rough Logic             Coding Logic
         Marks -- 90+ --> A+              marks >= 90 ? "A+"
         Marks -- 75 to 89-->A            marks >=75 ? "A"
         Marks -- 60 to 74 -->B           marks >=60 ? "B"
         Marks -- 40 to 59-->C            marks >= 40 ? "C"
         Marks -- 1 to 39 --> fail        marks >= 40 ? "fail"
         */
      //          int marks= 96 ;   // O :- A+
       // int marks = 77; // A
      //  int marks  = 67;  // B
       // int marks = 57;  // C
        int marks = 28;  // fail
        String Gradecalc = (marks>=90) ? "A+" : (marks>=75) ? "A"
                           :(marks>= 60 ) ? "B" : marks >=40 ? "C" : "fail";
        System.out.println(Gradecalc);
    }
}
