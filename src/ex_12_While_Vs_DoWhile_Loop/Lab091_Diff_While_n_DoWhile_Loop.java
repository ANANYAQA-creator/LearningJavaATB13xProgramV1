package ex_12_While_Vs_DoWhile_Loop;

public class Lab091_Diff_While_n_DoWhile_Loop {
    public static void main(String[] args) {

        // While Loop
        // While :-  Initialization -> Condition -> Body --> Updatation [Increment/Decrement]
        int i = 0;
        while (i < 0) {
            System.out.println(i);
        }
        // O/P will be nothing bcoz 0<0 is not possible

        // Do while Loop
        // Do while :- Initialization -> Body [run 1 time] -->  Updatation [Increment/Decrement]  --> While(Condition)
      int a =0;
        do {
            System.out.println("Enter the value of " + a);
            a++;
        } while(a<5);

    }
}
