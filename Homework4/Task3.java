package Homework4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter two numbers starting point and ending point");
        int start= input.nextInt();
        int end= input.nextInt();

        int evenSum=0;
        int oddSum=0;

        for (int i = start; i <end ; i++) {
            if(i%2==0){
                evenSum+=i;
            }else{
                oddSum=oddSum+i;
            }


        }
        System.out.println("Sum of all the even numbers "+ evenSum);
        System.out.println("Sum of all the odd numbers "+ oddSum);









    }
}
