package ex_15_StringBuilder_StringBuffer;

public class Lab113_StringBuilder_StringBuffer {
    public static void main(String[] args) {

        /*
        Disadvantages of String :- 1.  It's immutable in nature

        String Builder and String Buffer :- It's mutable in nature means able to change.
        String builder and String Buffer are classes which provides mutable(able to change) sequence of character.
        They are designed for String_Manipulation_Operation which help to appending, inserting, reverse or deleting characters of a string.

         Difference between String_Builder(not thread safe) and String_Buffer(thread safe means "slow") :-
         -String_Builder(not thread safe)
         -String_Buffer(thread safe means "slow")

         */
// Ways t0 create String
        String s0 ="Shivam";   // = Operator
        String s1 = new String ("Shivam");   // new Operator
        StringBuffer stringBuffer = new StringBuffer("Shivam");  // StringBuffer
        StringBuilder stringBuilder= new StringBuilder("Shivam");  // StringBuilder

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

    }
}
