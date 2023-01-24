package class11;

import java.util.Arrays;

public class D2Arrays1 {
    public static void main(String[] args) {

        int [][] matrix={{10,20,30},
                {45,55,60},
                {30,40,20,10,25}
        };
        // write a loop to print all the elements from this 2d loop
        for (int i = 0; i < matrix.length; i++) { // matrix.lenght gives number of 1d arrays
            for (int j = 0; j < matrix[i].length; j++) { //matrix[i].length gives the size of each 1d array
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }
    }
}
