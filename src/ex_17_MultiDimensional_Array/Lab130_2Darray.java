package ex_17_MultiDimensional_Array;

public class Lab130_2Darray {
    public static void main( String [] args) {

        //Let's create 2D arrays
        // 1,2,3
        // 4,5,6
        // 7,8,9

        int[][] array_2D_old = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},

        };

        // 10,20
        // 30,40
        // 50,60

        int[][] array1;
        array1 = new int [] [] {
                {10, 20},
                {30, 40},
                {50, 60}
    };

        // Let's create a 2D array_new

        int [] [] array_2D_new = new int [3][3];

        array_2D_new [0] [0] = 1;
        array_2D_new [0] [1] = 2;
        array_2D_new [0] [2] = 3;
      //array_2D_new [0] [3] = 56;  // Out of bound Exception array will come

        array_2D_new [1] [0] = 4;
        array_2D_new [1] [1] = 5;
        array_2D_new [1] [2] = 6;

        array_2D_new [2] [1] = 7;
        array_2D_new [2] [2] = 8;
        array_2D_new [2] [3] = 9;



    }
}
