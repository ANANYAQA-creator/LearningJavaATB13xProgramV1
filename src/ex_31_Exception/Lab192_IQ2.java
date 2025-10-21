package ex_31_Exception;

public class Lab192_IQ2 {
    public static void main(String[] args) {
         int b = 0;
         int c= 0;

         try{
             b = 10/c;  // Vulnerable code should be in try-catch
         }catch (ArithmeticException e) {
             System.out.println(e.getMessage());
         } catch (Exception e){
             System.out.println(e.getMessage());
         }
    }
}
