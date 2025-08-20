package ex_17_MultiDimensional_Array;

public class Lab133_Array_Iterate_ForLoop {
    public static void main (String [] args){
        int [] [] matrix= {{1,2,3},{4,5,6},{7,8,9}};  // matrix means rows and columns are equal

        // R->3
        // C->3

        //1,2,3
        //4,5,6
        //7,8,9

        System.out.println(matrix.length); //3

        //Using two For loop for iterate

        for (int i = 0; i < matrix.length ; i++) {   // Rows // 0,1,2
            for (int j=0; j< matrix[i].length; j++){     // Column //0,1,2
                //System.out.print(matrix [i][j] + " | " ) ;  // For Matrix print

                // STAR Pattern
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
