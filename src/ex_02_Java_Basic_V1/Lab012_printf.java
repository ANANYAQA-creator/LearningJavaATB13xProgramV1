package ex_02_Java_Basic_V1;

public class Lab012_printf {
    public static void main(String[] args) {

        // Usage of printf command   * print f= used for farmat the output
        int a= 30;

        System.out.printf("your variable_name is %d",a);
        // %d = int,long, byte,short (datatype)
        // %s= String
        // %f = float, double
        // %b= boolean

        int b = 20;
        System.out.printf("Variable_name sum of a and b is %d + %d",a,b);
    }
}
