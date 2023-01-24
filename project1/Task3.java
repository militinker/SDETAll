package project1;

public class Task3 {
    public static void main(String[] args) {
        // 3) Create a 2D array of integer values. Print the sum of all numbers.

        int[][] number={{1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum=0;

        for (int i = 0; i < number.length; i++)
            for (int j = 0; j < number[i].length; j++)
                sum=sum+number[i][j];
        System.out.println(sum);

    }
}
