package ex_15_StringBuilder_StringBuffer;

public class Lab117_Interview_Vowel {
    public static void main(String[] args) {

        // Write a java program to count the Vowels and Consonants
        // word - Pramod
        // vowel = a,e,i,o,u

        String input = "shivam";
        int vowels = 0;
        int consonants = 0;

        input = input.toLowerCase();
        System.out.println(input);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;

                } else {
                    consonants++;
                }
            }
        }
            System.out.println("Number of Vowels = " + vowels);
            System.out.println("Number of Consonants = " + consonants);
        }
    }

