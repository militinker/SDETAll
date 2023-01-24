package project1;

public class Task7 {
    public static void main(String[] args) {
       // 7)Write a java program to check whether a given number is prime or not?

        int num = 21;
        boolean isPrime = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                isPrime = true;
                break;
            }
        }

        if (!isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");



    }
}
