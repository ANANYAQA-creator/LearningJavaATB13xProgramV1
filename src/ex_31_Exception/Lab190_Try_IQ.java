package ex_31_Exception;

public class Lab190_Try_IQ {
    public static void main(String[] args) {
        System.out.println("Start of the Program");
        String name = null;
        try {
            name.trim();  //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.trim()" because "name" is null
            int a = 10/0;  //Exception in thread "main" java.lang.ArithmeticException: / by zero
        } catch (NullPointerException | ArithmeticException e){
            System.out.println("Now handled the NullPointer exception and Arithmetic exception also handled");
        } catch (Exception e){
            System.out.println("Able to add more Exception :-  Yes ");
        }
        System.out.println("End of the Program");
    }
}
