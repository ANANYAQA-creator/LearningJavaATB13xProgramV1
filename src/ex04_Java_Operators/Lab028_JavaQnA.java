package ex04_Java_Operators;

public class Lab028_JavaQnA {
    public static void main(String[] args) {

        /* Q.1 Concatination

        System.out.println( "Shivam"+" Rawte");
        int a = 10;
        int b =20;
        System.out.println(a+b);


        // + = behave differently according to datatype
        // + = Operator Overloading
*/

        // Q.2

        int a= 10;
        int b=10;
        String first_name = "Shivam" ;
        String last_name = "Rawte" ;

        System.out.println( a+b+first_name +last_name); // 20ShivamRawte
        System.out.println(first_name+last_name+a+b );  // ShivamRawte1010

        /* The above results are different bcoz of BODMAS

        B  Bracket  = ()
        O  Order (Power, indices or root)
        D  Division  = /
        M  Multiplication = *
        A  Addition= +
        S  Substraction = -
         */

       // Q.3  BODMAS
        System.out.println((9*3/9+1)*3);
    }
}

