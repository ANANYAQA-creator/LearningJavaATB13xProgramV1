package ex_31_Exception;

public class Lab187_Try_Catch {
    public static void main(String[] args) {

        System.out.println("1");
        try{
           int a=10/0;
           // int a = 10/5 ;  // 2
        }catch (ArithmeticException e){
            System.out.println("Not Possible");
        }
        System.out.println("2");
    }
}
