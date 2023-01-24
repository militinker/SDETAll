package Homework4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        for (int i = 1; i <=10; i++) {
            System.out.println("Would you like to apply for credit");
            String reply = input.next();
            if(reply.equalsIgnoreCase("yes")){
                break;
            }

        }



    }
}
