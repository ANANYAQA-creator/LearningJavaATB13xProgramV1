package ex_21_OOPs_Polymorphism.MethodOverLoading;

public class Calculator {
    public static void main(String[] args) {
      //  int attributes;
       Calc c1 = new Calc();
      int a1=  c1.add(22,4);
        System.out.println(a1);
       double d1 = c1.add(2.56,4.44);
        System.out.println(d1);

    }
}

class Calc {

   // int attributes;

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
