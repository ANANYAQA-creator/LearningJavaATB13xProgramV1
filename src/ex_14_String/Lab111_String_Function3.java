package ex_14_String;

import java.sql.SQLOutput;

public class Lab111_String_Function3 {
    public static void main(String[] args) {

        /*Q. How can create a String ?
        Ans.
       1. = Operator
        String name = "Shiv";  // Stored in SCP [String Constant Pool]
       2. new Operator
       String name = new String ("Shiv"); // Stored in Heap Area(Object)/Heap Memory
        */

        // Length
        String name ="Shivam";
        System.out.println(name.length());  // 6

        // charAT - index starts with  0,1,2,3,4,5,6
        System.out.println(name.charAt(4)); // a

        // concat
        System.out.println(name.concat(" Rawte")); // Shivam Rawte

        // contains
        System.out.println(name.contains("av")); // false
        System.out.println(name.contains("va")); // true
        System.out.println(name.contains("df")); // false
        System.out.println(name.contains("te")); // false

        // equals
        System.out.println(name.equals("Shivam")); // true
        System.out.println(name.equals("Sivam")); //false

        // equalsIgnoreCase

        System.out.println(name.equalsIgnoreCase("shivam")); // true
        System.out.println(name.equalsIgnoreCase("Shivam")); // true

        // indexof = index starts with 0=S,1=h,2=i,3=v,4=a,5=m

        System.out.println(name.indexOf("S")); // 0
        System.out.println(name.indexOf("i")); //2

        // indexOf , lastindecOf

        String name1 = "madam";
        // Return the index of the String of first occurence of the Sub-String like m=0 a=1 d=2 a=3, m=4
        System.out.println(name1.indexOf("m")); //0
        System.out.println(name1.lastIndexOf("m")); //4
        System.out.println(name1.indexOf("a"));  //1
        System.out.println(name1.lastIndexOf("a")); // 3

        // 8. replace
        System.out.println(name1.replace("m","M")); // MadaM

        // split

        String mail = "anany@rawte@1906@gmail.com;" ;
        String[] split_mail = mail.split("@");
        System.out.println(split_mail[0]); //anany
        System.out.println(split_mail[1]); //rawte
        System.out.println(split_mail[2]); // 1906
        System.out.println(split_mail[3]); // gmail.com

        // Lowercase
        String Myname = "Ananya rawte";
        System.out.println(Myname.toLowerCase());   // ananya rawte

        // Uppercase
        System.out.println(Myname.toUpperCase());  // ANANYA RAWTE

        //startwith

        System.out.println(Myname.startsWith("A"));  // true
        System.out.println(Myname.startsWith("s"));  // false

        // endwith
        System.out.println(Myname.endsWith("e"));  // true
        System.out.println(Myname.endsWith("t")); // false

        /*substring

        Start with beggining index and ends with negative index(-1)
         @param begining index 0,1,2,3,4,5
         @param negative index (-1)
         eg:- s=0, m=1 , i=2 , l=3 , e=4
         so if use subsrting (1,5) then O/P will be mile[ (m)1-beginning index ,(e)5[-1]=negative index  ]
        */

        String Expression = "smile";
        System.out.println(Expression.length()); //6
        System.out.println(Expression.substring(1,5)); // mile

         String anotherPalindrome = "ILove to Code again and again";
        System.out.println(anotherPalindrome.length()); // 29
         String extract =anotherPalindrome.substring(1,8);
        System.out.println(extract); // Love to

        System.out.println(Myname);
        System.out.println(Myname.length());  //12
        System.out.println(Myname.substring(1,9)); //nanya ra

        // Concatenation (+)

        String str1 = "Hi,";
        String str2 =" I am Software tester";
        System.out.println(str1 + str2); //Hi, I am Software tester

    }
    }