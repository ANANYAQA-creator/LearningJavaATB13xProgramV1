package ex_10_ForLoop;

public class Lab067_forLoop {
    public static void main(String[] args) {

        /*
         Loop  :- A block of code can be run repititive/multiple times [Repeat Something ].
         Condition is important for exit from the loop.

         for(I;C;U){
         }
         I :- Initialization
         C :- Condition
         U :- Updatation

         break :- it is useful for come out/exit from the loop.
 ------------------------------------------------------------------------------------------------------------
        for Loop :- Help you to repeat of the block of code
        works on ICU
        Initialization --> Condition --> Updatation [Increment/Decrement]
         */
        for (int i=0; i<10; i++) {
            System.out.println(i);  //o/p 0 to 9 and run 10 times
        }
    }
}
