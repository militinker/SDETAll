package class12;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter username, password and confirm password");

        String username= scan.nextLine();
        String password= scan.nextLine();
        String confirmPassword= scan.nextLine();

        if(username.isEmpty()|| password.isEmpty()){
            System.out.println("Username or Password cannot be empty");
        }
        else if(password.length()<8){
            System.out.println("Password is to short");
        }
        else if(password.contains(username)){
            System.out.println("Password cannot contain username");
        }
       else if(!password.equals(confirmPassword)){
            System.out.println("passwords do not match");
        }else {
           System.out.println("Your Username and password has been created");
       }


    }
}
