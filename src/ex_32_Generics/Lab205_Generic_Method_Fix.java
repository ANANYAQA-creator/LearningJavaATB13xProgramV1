package ex_32_Generics;

public class Lab205_Generic_Method_Fix {
    public static void main(String[] args) {

        display(5,7);
        display(2.6,2.6);
        display("Ananya","Rawte");

    }

    static <T> void display(T a, T b) {
        System.out.println(a);
        System.out.println(b);
    }

  //  static <T> T void display(T a,T b,T c) {
   //     System.out.println(a);
   //     System.out.println(b);
   //     return null;
  //  }
}