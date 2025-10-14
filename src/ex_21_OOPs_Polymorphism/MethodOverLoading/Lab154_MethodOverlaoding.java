package ex_21_OOPs_Polymorphism.MethodOverLoading;

public class Lab154_MethodOverlaoding {

    public static void main(String[] args) {

        MathOperation m1 = new MathOperation();
        int r1 = m1.add(2,5);
        System.out.println(r1);
        int r2 = m1.add(2,5,8);
        System.out.println(r2);
        double r3 = m1.add(2.5,5.2);
        System.out.println(r3);
        String r4 = m1.add("Shiv", "Sati");
        System.out.println(r4);
    }
}

class MathOperation {
    // METHOD OVER LOADING
    // In the same class , When you have a method with same name,
    // but different parameters/arguments and different return types

   int add (int a, int b) {
        return a+b;
    }

    int add(int a, int b, int c){
       return a+b+c;
    }

    double add( double a,double b){
       return a+b;
    }

    String add (String a ,String b){
       return a+b;
    }

}
