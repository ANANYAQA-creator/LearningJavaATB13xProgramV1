package ex_31_Exception;

public class Lab191_IQ {

    public static void main(String[] args) {

        //Unchecked Exception [100/0]
        // Exception in thread "main" java.lang.ArithmeticException: / by zero

        System.out.println("Starting the Program..!!!");
        try {
            String input_user = args[0];  // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
            Integer a = Integer.parseInt(input_user);
            Integer output = 100 / a;
        } catch (ArithmeticException |ArrayIndexOutOfBoundsException | NumberFormatException e){
            // new NumberFormatException (); JVM is creating the object
            System.out.println(e.getMessage());
        }
        System.out.println("End of the Program..!!!");
    }
}