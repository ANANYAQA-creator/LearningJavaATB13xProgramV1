package ex_32_Generics;

public class Lab204_Generics {

    public static void main(String[] args) {
// solution in the Lab206_Generic_Method_Fix
        temp_sum(4,5);
        temp_sum(2.5,3.5);
        temp_sum("Ananya","Rawte");

    }
    static int temp_sum(int a, int b){
        return a+b;
    }

    static double temp_sum(double a, double b){
        return a+b;
    }

    static String temp_sum (String a, String b){
        return a+b;
    }

}


