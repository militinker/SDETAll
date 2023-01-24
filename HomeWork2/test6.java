package HomeWork2;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Do you have a credit card");
        boolean cc=input.nextBoolean();

        if (!false){

            System.out.println("I can help you get one");
        } else {
            Scanner input1 = new Scanner(System.in);
            System.out.println("What is the balance on the card?");
            int debt = input1.nextInt();

            if (debt > 1000) {
                System.out.println("You should pay it off imminently");
            } else {
                System.out.println("You can spend more");
            }
        }
    }
}
