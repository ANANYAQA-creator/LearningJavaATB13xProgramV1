package ex_07_Command_Line_Input_UserInput;

public class Lab050_Increment_Pre_Post_Operator {
    public static void main(String[] args) {
    /*
     Incrememt Operator [++]
     prefix increment operator  =  ++variable
     postfix increment operator =  variable++
     */
        //  Pre-Increment Operator  (++variable) , Operand :- first increase the value by 1 then assigned.
        // Here value is incremented first then stored in the result

       // Here using Expression and Result Table  [ERT table]
      //  Line no. || a || Result (b)
          /*
        int a = 10;
        int b = ++a ; // In Pre Increment first increase the value by 1 [10 + 1 = 11] ; ---> then assigned
        System.out.println(a);
        System.out.println(b);

        Here using Expression and Result Table  [ERT table]
        Line no. || a || Result b
        16 || 10 || NA
        17 || 11 || 11
        18 || 11(NA) || 11
        18 || 11 || 11(NA)
         */
/* eg2. Pre Increment Operator
        int c = 14;
        System.out.println(++c);
        System.out.println(c);
        // ERT(Expression and Result Table)
        //Line no. || c || Print
        // 29 || 14 || NA
        // 30 || 15(++c) || 15(c)
        // 31 || 15 || 15

 */

     /* Post Increment Operator  variable++ --> first print then increase the value by 1.
        int a_post = 10;
        System.out.println(a_post++);   // first print 10 then increase by 1 means 11.
        System.out.println(a_post);

// ERT
        // Line no. | a_post | Print
        // 41 | 10 | NA
        // 42 | 11[result] | 10 [print the value of a_post] in Post decrement a_post++ = 10.
        // 35 | 11 | 11[NA]
*/
/*
            int d = 10;
            int result = ++d;
            System.out.println(d);
            System.out.println(result);

             ERT
             Line no.  | d  | print
             52  | 10 | NA
             53 |   11 | 11
             54 | 11   | 11
             55 | 11 | 11
             */


        int d1 = 10;
        int result1 = d1++;   // 10
        System.out.println(d1);  // 11
        System.out.println(result1);  // 10

        /* ERT
        Line | d1(result) | print
        66   | 10 | NA
        67   | 11 | 10
        68   | 11 | NA
        69   | NA | 10
         */
    }
}