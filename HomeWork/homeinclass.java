package HomeWork;

import java.util.Scanner;

public class homeinclass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        or int num1, num2, num3;

        System.out.println("Enter 3 numbers");
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();


        if(a>b&& a>c){
            System.out.println(a+" is the largest number");
        } else if(b>a&& b>c){
            System.out.println(b+" is the largest number");
        }else{
            System.out.println(c+" is the largest number");
        }





    }
}
