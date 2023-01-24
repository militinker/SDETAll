package class9;

public class ArraysDemo6 {
    public static void main(String[] args) {


        // create an empty array then store 45 44 33 20 and 10 in it then use a loop
        // to add all the elements wchi are present in even idexes


        //create an array and store 10 20 30 4 5 6 7 80
        //add all the elements which are multiple of 2

        int [] num1= new int[5];

        num1[0]=45;
        num1[1]=44;
        num1[2]=33;
        num1[3]=20;
        num1[4]=10;

        int sum=0;
        for (int i = 0; i < num1.length; i++) {
            if (i % 2 == 0) {
                sum = sum + num1[i];
            }
        }
            System.out.println(sum);


        int[] num2 = {10, 20, 30, 4, 5, 6, 7, 80};
        int sum2=0;

        for (int j = 0; j < num2.length; j++) {

            if (num2[j] % 2 == 0) {
                sum2 = sum2 + num2[j];
            }

        }
        System.out.println(sum2);



    }
}
