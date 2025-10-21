package ex_31_Exception;

public class Lab189_try_catch_multiple_IQ {
    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
