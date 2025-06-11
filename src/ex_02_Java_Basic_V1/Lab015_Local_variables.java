package ex_02_Java_Basic_V1;

public class Lab015_Local_variables {

    public static void main(String[] args) {

        //byte a = 15;
        // int bm = 10;
        short s = 76;
        char c = 'A';
        float PI = 3.147F;
        long L= 63287463L;
        long l1= 86473664l;
        double d = 583.8745;
        boolean b1 =true ;


        //int local ;
       // System.out.println(local);   // Not acceptable bcoz Default value of the Local variable is not assigned by the JVM. (Error)
       //  The default value of a local variable is never assigned.

        int a =10;
        {
            int b=39;   // Local variables are those which have accessible in block

        }
        int b=78;
        System.out.println(b);

    }
}
