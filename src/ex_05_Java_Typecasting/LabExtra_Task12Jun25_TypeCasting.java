package ex_05_Java_Typecasting;

public class LabExtra_Task12Jun25_TypeCasting {
    public static void main(String[] args) {
       /*
        2. TYPECASTING PROGRAMS
         🔹Program 4: Implicit Typecasting (Widening)
          Description: Convert int A =100 to double.


        int A= 100;
        double A1= (double)A ;
        System.out.println(A1);  // 100.0

---------------------------------------------------------------------------------------------------   */
        /*
        🔹 Program 5: Explicit Typecasting (Narrowing)
         Description: Casts a double to an int, cutting off decimals value.

  double D = 100.45;
  int A= (int) D;
        System.out.println(A);  // 100
   ---------------------------------------------------------------------------------------------------*/
           /*
     🔹 Program 6: Character to ASCII
      Description: Typecasts a character to its ASCII integer value. Example Print A ASCII Int value.


              char c ='A';
              int ASCIIvalue = (int)c;
        System.out.println(ASCIIvalue);  // 65
    --------------------------------------------------------------------------------------------------*/
/*
    🔹 Program 7: Typecasting in Division
        Description: int a = 10, int b = 3; now divide 10/3 and store the decimal value in the Result variable and print it.
*/
        int a=10;
        int b=3;
        int c = a/b;
        System.out.println(c); //3

        float Result = (float)c;
        System.out.println(Result); // 3.0

        // Needed the decimal value
        float result2 = (float)a/b;
        System.out.println(result2); //3.333

    }
}
