package class11;

public class Example1 {
    public static void main(String[] args) {

        int [][] matrix={{10,20,30},
                {45,55,60},
                {30,40,20,10,25}
        };

        for (int[] arr:matrix) {
            for(int number:arr){
                System.out.println(number+" ");
            }
            System.out.println();
        }



        /*for(int[] x :matrix ){
            for(int t:x){
                if(t%2!=0){
                    System.out.println(t);
                }
        // write a loop to print all the elements from this 2d loop
        for (int i = 0; i < matrix.length; i++) { // matrix.lenght gives number of 1d arrays
            for (int j = 0; j < matrix[i].length; j++) { //matrix[i].length gives the size of each 1d array
                if (matrix[i][j] % 2 != 0) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }

            }*/
    }
}
