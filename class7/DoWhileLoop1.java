package class7;

import java.util.Scanner;

public class DoWhileLoop1 {
    public static void main(String[] args) {

        boolean condition=true;
        Scanner scanner=new Scanner(System.in);
        int number=10;
        while (condition){
            System.out.println("Please enter your number between 10 to 20");
            int userInput= scanner.nextInt();
            if(userInput>number){
                System.out.println("Your entered number is greater");
            }else if(userInput<number){
                System.out.println("You entered smaller number");
            }else{
                System.out.println("You won");
                condition=false;
            }
        }
    }
}
