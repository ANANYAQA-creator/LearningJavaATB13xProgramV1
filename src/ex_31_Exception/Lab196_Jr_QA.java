package ex_31_Exception;

public class Lab196_Jr_QA {
    public static void main(String[] args) {

        // Another way to practise/use try-catch as Jr.QA
        try {
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            int b = 100 / a; // ArithmeticException
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
