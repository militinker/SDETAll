package Homework5;

public class Task2 {
    public static void main(String[] args) {

      /*  6) Print the following pattern:
        *

        *

        *
        **
        *
        **
        *

         */
        for (int i = 1; i <=2 ; i++) {

            for (int j = 1; j <= 1; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=3 ; i++) {
            for (int j = 1; j <=1 ; j++) {
                System.out.println("*");
            }
            System.out.println("**");
        }
        System.out.println("*");




    }
}
