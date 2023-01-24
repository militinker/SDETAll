package reviews;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        //while loop

        int a = 1;
        while (a <= 3) {
            System.out.println("im a while loop");
            a++;
        }
        //when we dont know how many times to repeat a block of code
        //while or do while

        int b = 1;
        do {
            System.out.println("do while");
        } while (b >= 3);


        //ask students if they understand loops?
        // if they dont-- tell them to practice more
        // if they understan-- you good move to array

        Scanner scan=new Scanner(System.in);
        String answer;
        do {
            System.out.println("Do you understand loops in Java");
            answer = scan.nextLine();
        } while(!answer.equalsIgnoreCase("yes"));

        System.out.println("Great jobs, let's learn arrays now");
    }
}
