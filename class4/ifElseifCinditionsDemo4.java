package class4;

public class ifElseifCinditionsDemo4 {
    public static void main(String[] args) {
        int number1=10;
        int number2=10;
        /*
        if number1 is equal to number2 on console => numbers are equal
        if number1>number2
         */

        if(number1==number2){
            System.out.println("Numbers are equal");
        }else if(number1>number2){
            System.out.println("Number1 is greater");
        }else if(number2>number1){
            System.out.println("Number 2 is greater");
        }
    }
}
