package ex_06_Java_Ternary_Operator;

public class Lab041_Max_Min_using_TernaryOperator {
    public static void main(String[] args) {

        // The maximum number between two number using ternary operator
        int a = 10;
        int b = 20;
        //Method 1[Predefined]  :-System.out.println(Math.max(a,b));

        // Method 2 - Using Ternary Operator

        int ResultMax = a>b ? a : b;
        System.out.println(ResultMax);

        // The minimum number between two number using ternary operator
        int c = 20;
        int d = 50;
        int ResultMin = c<d ? c:d ;
        System.out.println(ResultMin);
    }
}
