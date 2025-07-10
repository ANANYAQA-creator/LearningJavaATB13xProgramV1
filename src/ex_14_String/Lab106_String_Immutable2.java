package ex_14_String;

public class Lab106_String_Immutable2 {
    public static void main(String[] args) {

        String s1 = "hello";
        s1.concat("world");
        System.out.println(s1); //hello

        // After reassign the value of String
        s1= s1.concat("world");
        System.out.println(s1); //helloworld
    }
}
