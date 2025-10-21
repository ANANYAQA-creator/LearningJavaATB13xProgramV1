package ex_31_Exception;

public class Lab188_Try_catch_Multiple {
    public static void main(String[] args) {

        System.out.println("1");
        try{
            int a = 10/0;
        }catch (ArithmeticException e){
            System.out.println("Not Possible");
        } catch (Exception e){
            System.out.println("It's also not possible");
            System.out.println(e.getMessage());
        }
        System.out.println("2");
    }
}
