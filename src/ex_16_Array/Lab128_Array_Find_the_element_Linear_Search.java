package ex_16_Array;

public class Lab128_Array_Find_the_element_Linear_Search {
    public static void main(String []args ){

        int []a = { 12,33,15,54,64,13,63};
        // Find the element(54) in Array and index of element
int target = 54;

        for (int i = 0; i < a.length; i++) {
            if(target==a[i]) {
                System.out.println(i);
            }
        }


    }
}
