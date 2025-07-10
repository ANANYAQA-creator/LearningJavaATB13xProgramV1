package ex_14_String;

public class Lab107_String_Function {
    public static void main(String[] args) {

        char c ='A';
        System.out.println(c);  // there is no fucntion for c now it simply print O/P :- A

        String s1= "ABCD";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.concat("EFGH"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.endsWith("D"));

    }
}
