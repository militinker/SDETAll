package HomeWork3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter fist number");
        int num1=input.nextInt();
        System.out.println("Please enter an operator +,-,*,/");
        char operator=input.next().charAt(0);
        System.out.println("Please enter second number");
        int num2= input.nextInt();

        switch(operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
