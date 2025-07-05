package ex_10_ForLoop;

public class Lab079_ForLoop_Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            if (i == 5){
                continue;   // it is used for skip the code
            }
                System.out.println(i);   // O/P 0 to 7 except 5, and run 8 times
        }
    }
}
