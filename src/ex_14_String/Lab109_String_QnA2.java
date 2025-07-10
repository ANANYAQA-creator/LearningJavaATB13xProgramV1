package ex_14_String;

public class Lab109_String_QnA2 {
    public static void main(String[] args) {

        // SCP
        String s1 = "Hello";
        String s4 = "Hello" ;
        String s10 = "Hello";
        //Here only one value of String (Hello) stored in SCP. it is immuatble[can't be change] and have memory management.

        // Heap Area {Object}

        String s2= new String("Hello");
        String s3= new String("Hello");
        String s5= new String("hello");

        // Here 3 value of String are present because in Heap area object it create multiple value.
       // So in SCP :- 1 , in OA :- so Total String :- 4


        // == Comparison -->String --> this check the location reference
        System.out.println(s1 == s3); // false
        System.out.println( s1 == s4);// true
        System.out.println( s2 == s3 );// Objects are created in different different place in Heap Area so O/P ;- false

        // equals( Content) --> check for the content value

        System.out.println(s1.equals(s2));  // true bcoz content is same [Hello,Hello]
        System.out.println(s1.equals(s5)); // false bcoz of case sensitivity[Hello,hello]
        System.out.println(s1.equalsIgnoreCase(s5));  // true bcoz ignore the case sensitivity

        /* == check for the references
           = check for the assignment(content) of value */
    }
}
