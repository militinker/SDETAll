package project1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
         1)Using Scanner create an array of integer values.
          After the array is created, calculate the sum of all stored elements in that array.
         */

        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];

        int sum=0;

        for (int i = 0; i <arr.length ; i++) {
            System.out.println();
            arr[i]= input.nextInt();
        }

        for (int j = 0; j <arr.length ; j++) {
            sum+=arr[j];

        }
        System.out.println(sum);



    }
}
