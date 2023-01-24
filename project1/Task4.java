package project1;

public class Task4 {
    public static void main(String[] args) {
        //4) Create a 2D array or integer type where you will store odd and even numbers.
        //Develop a program which will identify/print the even numbers only.

        int[][] number={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        for (int i = 0; i < number.length; i++)
            for (int j = 0; j < number[i].length; j++)
                if(number[i][j]%2==0){
                    System.out.println(number[i][j]);
                }

    }
}
