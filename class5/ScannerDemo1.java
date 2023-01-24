package class5;
import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        /*
        Scanner = name of the class
        scan = just a variable like we create primitive variables
        =means we are assigning value to the variable its assignment operator
        System.in= is telling computer that we want to read the data from the keyboard
         */

       /* System.out.println("Please enter your age");
        int age=scan.nextInt();
        System.out.println("You are "+age+" Years old");

        System.out.println("Please enter your weight");
        double weight=scan.nextDouble();
        System.out.println(" your weight is " +weight);
        System.out.println("Are you hungry?");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry "+hungry);*/


       /* System.out.println("Please enter your gender");
        char gender=scan.next().charAt(0);
        System.out.println("Your gender is "+gender);*/

        System.out.println("Please enter your name");
        String name=scan.next();
        System.out.println("your name is "+name);

        scan.nextLine();
        System.out.println("Pleas enter your full name");
        String fullName=scan.nextLine();
        System.out.println("Your full name is  "+fullName);

        scan.close();



    }
}
