package ex_15_StringBuilder_StringBuffer;

import java.util.Scanner;

public class Lab112_InterviewCoding_Palindrome {
    public static void main(String[] args) {

        /* Check Palindrome number
        A palindrome number is a number that remains the same when its digits are reversed.

        madam -> reverse(Palindrome) -->madam
        s1 = madam
        s1_reverse = madam
        s1==s2 reverse
*/

        // Method 1 :- Ideal way to check Palindrome

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value to check it's PALINDROME or not ?");
        String input = scanner.next();
        String newString_reversed = reverseString(input);


        if (newString_reversed.equalsIgnoreCase(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    static String reverseString(String UserInput) {
        String reversed = "";
        for (int i = UserInput.length() - 1; i >= 0; i--) {
            reversed = reversed + UserInput.charAt(i);

            // madam.charAt(0) = m
            // madam.charAt(1) = a
        }
        return reversed;
    }
}



        /* Method 2 :- StringBuffer

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value and check if it's Palindrome");
        String s1 = scanner.next();

        // Create a String Buffer and reverse it
        StringBuffer s1_reverse = new StringBuffer(s1);
        String s2 = s1_reverse.reverse().toString();

        if (s1.equals(s2)) {
            System.out.println(s1 + " This is a Palindrome");
        } else {
            System.out.println(s1 + "This is not Palindrome");
        }
        System.out.println(s1 == s2);

*/

        /* Method 3 = String Builder

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value to check it's Palindrome or not ?");
        String input = scanner.next();
        String stringBuilderSB = reverseStringBuilderSB(input);

        if (stringBuilderSB.equalsIgnoreCase(input)){
            System.out.println("This is Palindrome");
        } else {
            System.out.println("This is not Palindrome");
        }

    }
    static  String reverseStringBuilderSB ( String UserInput){
        StringBuilder stringBuilderSB = new StringBuilder(UserInput);
        return stringBuilderSB.reverse().toString();

        }
        }
         */
