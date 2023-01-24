package HomeWork3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your quiz score");
        int quizscore=input.nextInt();
        System.out.println("Please enter your mid term score");
        int midterm=input.nextInt();
        System.out.println("Please enter your final scores");
        int finalscores=input.nextInt();

        int averagescore=(quizscore+midterm+finalscores)/3;

        if(averagescore>=90){
            System.out.println("Your grade is A");
        }else if(averagescore>=70&& averagescore<90){
            System.out.println("Your grade is B");
        }else if(averagescore>=50 && averagescore<70){
            System.out.println("Your grade is C");
        }else if(averagescore<50){
            System.out.println("your grade is F");
        }
    }
}
