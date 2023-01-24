package Homework5;

public class Task7 {
    public static void main(String[] args) {

        /*4) 5) Create an array of size 5 on integers and calculate the sum of all elements in an array.
                */



        int [] numbers={5,7,9,3,17};
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum+= numbers[i];

        }
        System.out.println(sum);

    }
}
