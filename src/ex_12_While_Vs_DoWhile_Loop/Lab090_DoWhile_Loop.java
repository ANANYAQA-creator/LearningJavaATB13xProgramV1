package ex_12_While_Vs_DoWhile_Loop;

public class Lab090_DoWhile_Loop {
    public static void main(String[] args) {

        /* While Vs Do While

        While :-  Initialization -> Condition -> Body --> Updatation [Increment/Decrement]

        Do while :- Initialization -> Body [run 1 time] -->  Updatation [Increment/Decrement]  --> While(Condition)
         */

        int i = 0;
        do {
            System.out.println("This is the body which will execute atleast 1 time = " + i);
            i++;
        } while (i<5) ;

    }
}
