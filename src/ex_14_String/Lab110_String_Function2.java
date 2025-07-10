package ex_14_String;

public class Lab110_String_Function2 {
    public static void main(String[] args) {

        String str1 ="Hello";
        String str2 ="Hello";
        String str3 = new String("Hello");
        System.out.println(str1 == str2);   // true bcoz == check the references and str1 and str2 have single value[Hello] in SCP.
        System.out.println( str1 == str3);  // false bcoz == check the references here str1 value in SCP and Str3 value in Object area
        System.out.println( str1.equals(str3)); // = true bcoz equals check the content of value and both str1 and str3 have 'Hello' value.

    }
}
