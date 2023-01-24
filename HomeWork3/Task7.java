package HomeWork3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter name of your country");
        String country=input.next();

        switch(country){
            case "Serbia":
                System.out.println("You speak Serbian");
                break;
            case "France":
                System.out.println("You speak French");
                break;
            case "Sweden":
                System.out.println("You speak Swedish");
                break;
            case "Germany":
                System.out.println("You Speak German");
                break;
            case "Japan":
                System.out.println("You speak Japanese");
                break;
        }
    }
}
