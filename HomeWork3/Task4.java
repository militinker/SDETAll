package HomeWork3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month=input.next();

        switch(month){
            case "December":
            case "January":
                case "February":
                    System.out.println("You were born in Winter");
                    break;
            case "March":
            case "April":
            case "May":
                System.out.println("You were born in Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("You were born in summer");
                break;
            case "Sepmtember":
            case "October":
            case "November":
                System.out.println("You were born in the Fall");
                break;
            default:
                System.out.println("Wrong input");

        }
    }
}
