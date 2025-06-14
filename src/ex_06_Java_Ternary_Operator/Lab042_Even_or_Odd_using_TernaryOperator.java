package ex_06_Java_Ternary_Operator;

public class Lab042_Even_or_Odd_using_TernaryOperator {
    public static void main(String[] args) {
        // Even number :- Divisible by 2
        // Odd number :- Not divisible by 2

        int num1 = 10;
        int num2 = 13;

        String Result_EvenOrOdd = (num1 % 2 == 0) ? "Even" : "Odd" ;
        String Result_EvenOrOdd1 = (num2 % 2 == 0) ? "Even" : " Odd" ;

        System.out.println(Result_EvenOrOdd);
        System.out.println(Result_EvenOrOdd1);
    }
}
