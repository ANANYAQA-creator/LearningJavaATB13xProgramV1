package ex_14_String;

public class Lab104_String_Immutable {
    public static void main(String[] args) {

        String name1 = "Pramod";  // String Constant Pool {SCP}
        name1.toUpperCase();
        // String is immutable [can't be change] and final in nature.
        System.out.println(name1);  // Pramod

        String name2 = "Shivam";
        name2 = name2.toUpperCase();  // here is reassign the value of String and it is changed to Uppercase
        System.out.println(name2); //SHIVAM

    }
}
