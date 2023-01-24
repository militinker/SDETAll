package HomeWork3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 3 different numbers");
        int num1=input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();

        if(num1>num2){
            if(num1>num3){
                System.out.println("The largest number is "+num1);
            }
        }else if(num2>num1){
            if(num2>num3){
                System.out.println(num2+" is the largest number");
            }
        }else if(num3>num1){
            System.out.println(num3+ " is the largest number");
        }
    }
}
