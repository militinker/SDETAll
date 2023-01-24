package class5;
import java.util.Scanner;
public class SwitchCaseDemo4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your gender  m or f");
        char gender=scanner.next().charAt(0);

       // char gender='M';

        switch (gender){
            case 'f':
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
            case 'm':
                System.out.println("male");
                break;
            default:
                System.out.println("not specified");
        }
    }
}
