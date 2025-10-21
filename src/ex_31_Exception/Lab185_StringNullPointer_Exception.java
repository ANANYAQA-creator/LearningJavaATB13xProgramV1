package ex_31_Exception;

public class Lab185_StringNullPointer_Exception {
    public static void main(String[] args) {

        String name = null;
        name.trim();

        //Unchecked Exception
        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.trim()" because "name" is null
    }
}
