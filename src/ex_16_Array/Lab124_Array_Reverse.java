package ex_16_Array;

public class Lab124_Array_Reverse {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        // Reverse = 5,4,3,2,1

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);

        }
    }
}
