package HomeWork2;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Do you have a diploma");
        boolean diploma=input.nextBoolean();

        if (diploma){
            System.out.println("Congratulations");
            System.out.println("Please enter your gpa score");
            double score=input.nextDouble();

            if (score>=3.5){
                System.out.println("You are eligible for scholarship");
            } else {
                System.out.println("You should've studied harder");
            }
        }else{
            System.out.println("Get a degree");
        }
    }
}
