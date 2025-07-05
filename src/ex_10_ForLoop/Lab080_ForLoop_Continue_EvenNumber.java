package ex_10_ForLoop;

public class Lab080_ForLoop_Continue_EvenNumber {
    public static void main(String[] args) {

        for (int i = 0; i <=50 ; i++) {    // run 51 times from 0 to 50
           if( i%2 == 0){
           //    System.out.println("Even Number :- " + i);
               continue;   // bAsically it means skipping the condition
           }
            System.out.println("ODD Number :- " + i );
        }
    }
}
