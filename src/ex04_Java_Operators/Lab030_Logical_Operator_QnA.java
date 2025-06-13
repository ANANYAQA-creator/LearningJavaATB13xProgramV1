package ex04_Java_Operators;

public class Lab030_Logical_Operator_QnA {

    public static void main(String[] args) {
        int balaji_salary = 12;

        boolean b = ! (balaji_salary >10 || balaji_salary < 5 );

        //balaji salary >10   =  12 >10  true
        // balaji_salary < 5  = 12 <5  false
        // balaji salary >10 || balaji_salary < 5    (true || false)
       //  ! (true || false) = false

                System.out.println(b);
    }
}
