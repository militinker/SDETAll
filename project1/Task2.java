package project1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
         2)Using Scanner create an array of countries. When an array is created,
         retrieve all values from it and while retrieving those values print capital for each country. (use 2 different loops).
         */

        Scanner input=new Scanner(System.in);
        String[] country=new String[3];

        for (int i = 0; i < country.length ; i++) {
            System.out.println();
            country[i]=input.nextLine();
        }



        if(country[0].equals("USA"))
                System.out.println("Washington DC");
        if(country[1].equals("France"))
                System.out.println("Paris");
        if(country[2].equals("Germany"))
                System.out.println("Berlin");







    }
}
