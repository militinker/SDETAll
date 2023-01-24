package reviews;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
       /* int i=1;

        while(1<=4){

            System.out.println("hello");
            i++;
        }*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Are you tired");
        boolean tired=scan.nextBoolean();

        while(!tired){

            System.out.println("This is great");
            System.out.println("Lets Study Java");
            System.out.println("Are you tired yet");

            tired= scan.nextBoolean();
        }



    }
}
