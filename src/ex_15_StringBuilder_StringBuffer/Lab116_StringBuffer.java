package ex_15_StringBuilder_StringBuffer;

public class Lab116_StringBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);  //JavaProgramming
        sb.delete(5,14); // Java
        System.out.println(sb);
        sb.replace(0,4,"C++");
        System.out.println(sb);  //C++
    }
}
