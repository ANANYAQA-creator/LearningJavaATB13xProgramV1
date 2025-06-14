package ex_06_Java_Ternary_Operator;

public class Lab044_Maxbetween_ThreeNumber_LogicBuildingFormula {
    public static void main(String[] args) {

        /*
         Here using Logic building formula

         Step1 :- Find the inputs and outputs  --> Find what datatypes needed to used and what is the exactly output interviewer looking for !!
         Step2 :- Rough Logic, Brute force --> explain it side by side.
         Step3 :- Write the logic and present the solution (Dry Run)
         Step4 :- Optimize and discussion.
         Step5 :- Edge Cases and extra discussion.

       // **  Find the maximum between three numbers,

        Step 1 :- First find the input and output

                I :- n1,n2,n3 --- int Datatype
                O :- String   --- max number ?
                 */

         int n1= 3;
         int n2 = 10;
         int n3 = -4;

         /*
          Step 2 :- Rough Logic
          n1 >n2 and  n1>n3 : n1
          n2> n3 and  n2 >n1 : n3
          n3
          */

        /*
        Step3 :- Write the Logic
        int max = n1>n2 ? A :B
        here A = n1 > n3 ? n1 : n3
             B = n2 > n3 ? n2 : n3
         */
       int max = (n1>n2) ? (n1>n3) ? n1:n3 : (n2>n3) ? n2 : n3 ;
        System.out.println(max);

    }
}
