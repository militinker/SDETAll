package HomeWork3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number from 1-7");
        int day=input.nextInt();

        if(day>=1 && day<=5){
            System.out.println("Its Weekday");
        }else if(day>=6 && day<=7){
            System.out.println("It is Weekend");
        }else{
            System.out.println("Invalid Day");
        }

    }
}
