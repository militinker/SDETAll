package Homework4;

import java.util.Scanner;
import java.util.SortedMap;

public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total=0;

        for (int i = 0; i < 5; i++) {
            System.out.println("please enter the item and price");
            String item = input.next();
            double price = input.nextDouble();
            total=total+price;
            System.out.println("You owe " + total);
        }
        System.out.println("Please enter your payment");
        double payment = input.nextDouble();

        if (payment > total) {
            System.out.println("Your change is " + (payment - total));
        }
            System.out.println("Thanks for Shopping");


















    }
}
