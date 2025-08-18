package ex_16_Array;

public class Lab125_Arrays_SumOfArrays {

    public static void main(String[] args){

        int[] numbers = {12,1,7};
        int sum = 0;
        // Sum Of Arrays

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
