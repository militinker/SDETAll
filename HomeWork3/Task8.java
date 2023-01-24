package HomeWork3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your grade");
        char grade=input.next().charAt(0);

        switch(grade){
            case 'A':
                System.out.println("You are an excellent student");
                break;
            case 'B':
                System.out.println("You are a good student");
                break;
            case 'C':
                System.out.println("You are an average student");
                break;
            case 'D':
                System.out.println("You are a bad student");
                break;
            default:
                System.out.println("Not Acceptable");
        }
    }
}
