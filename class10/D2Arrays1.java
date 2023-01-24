package class10;

public class D2Arrays1 {
    public static void main(String[] args) {

     int [][] matrix={ { 10,20,30},
                        {55,22,45},
                       {100,220,450}
     };
       // System.out.println(matrix[1][1]);
        for (int i = 0; i < matrix.length; i++) { // tells how many arrys are in matrix in this case 3
            for (int j = 0; j < matrix[i].length; j++) {// the value of i is 0 and when we say .length will give us the
                System.out.println(matrix[i][j]);     // lenght of 1d array that we are storing on index 0


            }
        }
    }
}
