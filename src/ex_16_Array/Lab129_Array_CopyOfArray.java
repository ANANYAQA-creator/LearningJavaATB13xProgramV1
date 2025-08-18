package ex_16_Array;

public class Lab129_Array_CopyOfArray {
    public static void main(String[] args){

        int[] original= {1,2,3,4,5,6};
        int [] copy = new int[original.length];
     System.arraycopy(original,0,copy,4, original.length);
        System.out.println();

    }
}
