package ex_10_ForLoop;

public class Lab076_forLoop1 {
    public static void main(String[] args) {

        for (int i=0;i<10;i++)
        {
            System.out.println(i);     //O/P 0 to 9 and run 10 times
        }

        for (int i=0;i<=10;i++)        // O/P 0 to 10 and run 11 times [=]
        {
            System.out.println(i);
        }

        for (int i=1;i<10;i++)         // O/P 1 to 9 and run 9 times
        {
            System.out.println(i);
        }

        for (int i=1;i<=10;i++)        // O/P 1 to 10 and run 10 times
        {
            System.out.println(i);
        }
    }
}
