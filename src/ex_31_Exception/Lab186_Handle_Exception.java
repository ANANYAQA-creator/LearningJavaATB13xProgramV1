package ex_31_Exception;

public class Lab186_Handle_Exception {
    public static void main(String[] args) {

        // Checked Exception
        // To handle checked exception, we use try-catch
        int a = 0;
        try {
            a= 10/0;  //java.lang.ArithmeticException
           // a= 10/5;  // 2
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Divide by Zero not allowed");
        }
        System.out.println(a);

        // Checked - JVM
        // JVM knows about it , During Compilation - JVM is saying that
        // there can be case when this file is not found.

        // JVM knows that this may lead to file not found exception
        // so it telling to handle it.
    }

}
