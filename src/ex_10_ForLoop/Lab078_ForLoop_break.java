package ex_10_ForLoop;

public class Lab078_ForLoop_break {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {   //from 0 to 50 and run 49 times
            if( i == 5) {
                break;
            }else {
                System.out.println(i);
            }
        }
    }
}
