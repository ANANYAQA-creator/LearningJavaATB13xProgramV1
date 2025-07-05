package ex_11_WhileLoop;

public class Lab082_WhileLoop {
    public static void main(String[] args) {

        /*
        While Loop :-  it verifies the condition before executing the block of code. Also known Entry Controlled Loop.

        follow :- I;C;U;     Initialization--> Condition -->Updatation [Increment/ Decrement]
        Only 'INITIALIZATION' can be outside of the loop.

        INITIALIZATION
        while(CONDITION) {
        // block of code we want execute

        UPDATATION
        }
         */

        int i=0;
        while (i<10){
            System.out.println(i);
            i++;
        }

        // INITIALIZATION-->CONDITION--> UPDATATION [I;C;U]   no difference in 'for' and 'while' Loop
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
    }
}
