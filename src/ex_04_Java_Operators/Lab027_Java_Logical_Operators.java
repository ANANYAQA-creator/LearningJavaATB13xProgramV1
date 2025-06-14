package ex_04_Java_Operators;

public class Lab027_Java_Logical_Operators {
    public static void main(String[] args) {

        /* Logical Operators  ;- refer diagram
       && AND
       || OR
       ! NOR
    */

        boolean a =true;
        System.out.println(!a);

        boolean b = true ;
        System.out.println(!!b);

        boolean c = true || false;
        System.out.println(c);

        boolean c1= true && false ;
        System.out.println(c1);


    }
}
