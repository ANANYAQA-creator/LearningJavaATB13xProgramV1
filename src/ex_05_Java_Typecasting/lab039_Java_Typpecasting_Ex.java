package ex_05_Java_Typecasting;

public class lab039_Java_Typpecasting_Ex {
    public static void main(String[] args) {

        // Ex1.
        long phone = 9039494640l;
         // short s = phone;   // Implicit casting not allowed in the widening
          short s1 = (short) phone;
        byte b= (byte) phone;

        System.out.println(b);
        System.out.println(s1);

        // Ex2.
int coursefee = 100;
// int GST1 = 18.56;
float GST = 18.45f;

        // System.out.println(coursefee+GST1);
        System.out.println(coursefee +GST);

        // ex 3

        int coursefee1 = 120;
        float GST2 = 19.45f ;

      // int total = coursefee1+GST2 ;  narrow implicit not allowed
        int total1 = coursefee1+ (int)GST2 ;  // narrow explicit widening
        System.out.println(total1);

        float total2 = coursefee1+GST2 ;  // Widening implicit
        float total = (float) coursefee1 +GST2 ;  // Widening explicit worked.

       System.out.println(total);
       System.out.println(total2);
    }
}
