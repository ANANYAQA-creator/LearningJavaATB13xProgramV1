package ex_31_Exception;

public class Lab193_try_catch_finally {
    public static void main(String[] args) {

        //int a =1 ;
        int a =Integer.parseInt(args[0]);
        int c=0;
        try {
            c = 10/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
         //   e.printStackTrace();
        } finally {
            System.out.println("I will be always executed.");
        }


    }
}
