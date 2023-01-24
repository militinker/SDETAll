package project1;

public class Task6 {
    public static void main(String[] args) {
        //6)Write a program to swap 2 numbers without a temporary variable?

        int [] numbers={16,8,72,10,6};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }

        System.out.println();
        numbers[4]=5;
        numbers[0]=24;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }






    }
}
