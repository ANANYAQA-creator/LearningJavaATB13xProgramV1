package ex_15_StringBuilder_StringBuffer;

public class Lab114_StringBuffer_StringFunction {
    public static void main(String[] args) {

        StringBuffer name = new StringBuffer("Shivam");

        // Append
        System.out.println(name);  //Shivam
        System.out.println(name.append("Rawte")); //ShivamRawte

        // reverse
        System.out.println(name.reverse()); //etwaRmavihS

        //
        String s1 = "Hello";
        String s2 = "World";  //Create a new String
        String s3 = s1+s2;
        System.out.println(s3); // Hello World
        System.out.println(s1);  // hello
    }
}
