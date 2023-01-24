package HomeWork2;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("How old are you?");
        int age=input.nextInt();

        if(age>=18){
            System.out.println("You can get your drivers license");

        } else {
            System.out.println("You should get a learners permit");
        }
    }
}
