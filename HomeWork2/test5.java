package HomeWork2;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter name of the city");
        String city=input.next();
        System.out.println("Please enter the Temperature");
        int temp=input.nextInt();

        System.out.println("The temperature in the "+city+ " is "+((temp-32)*5/9));
    }
}
