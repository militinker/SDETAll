package HomeWork2;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter years worked");
        int years= input.nextInt();
        System.out.println("Please enter annual salary");
        int salary= input.nextInt();

        if (years>=5){
            System.out.println("You are eligible for the bonus");
            if (salary>50000){
                System.out.println("Your bonus is 5000");
            }else{
                System.out.println("Your bonus is 3000");
            }
        }else{
            System.out.println("you are not eligible for the bonus");
        }
    }
}
