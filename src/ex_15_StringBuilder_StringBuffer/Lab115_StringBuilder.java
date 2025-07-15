package ex_15_StringBuilder_StringBuffer;

public class Lab115_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Pramod");
        //append
        System.out.println(sb.append(123));  //Pramod123
        // reverse
        System.out.println(sb.reverse()); // 321domarP

        // Practice
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append("World");   // HelloWorld
        sb1.reverse();   //dlroWolleH
        System.out.println(sb1); // dlroWolleH

    }
}
