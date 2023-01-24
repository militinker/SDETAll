package HomeWork2;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {



        int price=375000;
        double rate=2.7;

        if (rate>4.5){
            System.out.println("You won't be buying a house");
        } else {
            System.out.println("You can buy a house");
        } if (price>200000){
                System.out.println("You need to take a loan");
            } else {
            System.out.println("You can pay cash");
        }
    }
}
