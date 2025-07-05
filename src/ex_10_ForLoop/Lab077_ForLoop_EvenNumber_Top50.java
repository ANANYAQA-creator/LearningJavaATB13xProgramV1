package ex_10_ForLoop;

public class Lab077_ForLoop_EvenNumber_Top50 {
    public static void main(String[] args) {

        // Find the even number from 1 to 50
        for (int i = 1; i <= 50; i++) {  // From 1 to 50 run 50 times

            // Even Number =  i%2 ==0
            if (i % 2 == 0) {
                System.out.println("Even Number :-" + i);
            } //else {
              //  System.out.println("Odd Number :- " + i);
           // }
        }
    }
}

