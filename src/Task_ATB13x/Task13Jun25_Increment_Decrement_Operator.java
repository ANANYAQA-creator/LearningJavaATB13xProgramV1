package Task_ATB13x;

public class Task13Jun25_Increment_Decrement_Operator {
    public static void main(String[] args) {

  /* 🔹 Program 1:
        int a = 5;
        int b = a++;    // Post increment :-  first print the value then increase by 1. so  a =6,  b = 5
        System.out.println("a: " + a + ", b: " + b);
    // ERT
        // 7 | 5 | NA
        // 8 | 6(a) | 5(b)
        */

     /* 🔹 Program 2:
        int i = 1;
        i = i++ + ++i;
        System.out.println(i); // ? Ans. 4

      //  A+B      :- 1 + 3 = 4
      // A = i++  --> 1(expr of A) --> become after increase by 1, s0 1+1 = 2
      // B = ++i  --> 3(expr of B)
     */

       /* 🔹 Program 3:
        int x = 5;
        System.out.println(x++ + ++x); // ?  5+7 =12
        System.out.println(x);  // 8

        // A+B -->
        // A = x++ --> 5(expression of A)---> x=6
        // B = ++x --> 7(expression of B)----> x= 7
        */

       /* 🔹 Program 4:
        int x = 5;
        System.out.println(++x); // Output: ?   6
        System.out.println(x++); // Output: ?   6
        System.out.println(x);   // Output: ?   7
*/
      /*  🔹 Program 5:  Interview Question
        int a = 5;
        int b = a++ + ++a;
        System.out.println("a: " + a); // Output: ?  7
        System.out.println("b: " + b); // Output: ?  12

         // A = a++ --> 5(expr of A) ---> a=6
         // B = ++a --> 7(expression of B) ---> a=7

    */

      /*  🔹Program 6:  Interview Question
        int x = 5;
        int y = x++ + ++x + x++ + ++x;
        System.out.println("x = " + x + ", y = " + y);

        // A --> x++ --> 5(expr of A) --> 6
        // B --> ++x --> 7(expr of B) --> 7
        // C --> x++ --> 7(expr of C) --> 8     // x = 9
        // D --> ++x --> 9(expr of D) --> 9     // y = 28
*/


    }
}
