package project1;

public class Task5 {
    public static void main(String[] args) {
        //5)Create a 2D array of integers.
        // Develop a program which will calculate the sum of  even and odd numbers for that array.

        int[][] number = {{10, 25, 30},
                {42, 57, 66},
                {76, 87, 95} };
        int sum = 0;
        int sum1 = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if (number[i][j] % 2 == 0) {
                    sum = sum + number[i][j];
                }
            }

            for (int j = 0; i < number[i].length; i++) {
                if (number[i][j] % 2 != 0) {
                    sum1 = sum1 + number[i][j];
                }
            }

        }
        System.out.println("The sum of all Even numbers from Array is "+sum);
        System.out.println("The sum of all Odd numbers from Array is "+sum1);



    }
}
