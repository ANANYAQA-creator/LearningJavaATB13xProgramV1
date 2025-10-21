package ex_31_Exception;

public class Lab183_Exceptions_Explained {

    public static void main(String[] args) {

        System.out.println("Starting the Program..!!!");
        String input_user = args [0];
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        Integer a = Integer.parseInt(input_user);
        Integer output = 100/a;
        //Unchecked Exception [100/0]
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        System.out.println(output);
        System.out.println("End of the Program..!!!");


    //    for String =Ananya
       // Exception in thread "main" java.lang.NumberFormatException: For input string: "Ananya"

    }
}
