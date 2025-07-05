package ex_11_WhileLoop;

import java.util.Random;
import java.util.Scanner;

import static com.sun.beans.introspect.PropertyInfo.Name.bound;

public class Lab088_WhileLoop_Guessing_Game {
    public static void main(String[] args) {

        // Guess a number between 1 to 100
        // Random => 100

       Random random = new Random();
    int NumbertoGuess= random.nextInt(100)+1;
       // System.out.println(NumbertoGuess);

        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter the number ");

        int guess ;
        int attempt = 0;
        while(true) {
            System.out.println("Enter another guess!");
            guess = scanner.nextInt();
            attempt++;

            if (guess < NumbertoGuess) {
                System.out.println("Too less, try again");
            } else if (guess > NumbertoGuess) {
                System.out.println("Too High, try again");
            } else {
                System.out.println(" Found the Correct matched in the " + attempt + "Correct matched is" + guess);
                break;
            }
            //
        }
    }
}
