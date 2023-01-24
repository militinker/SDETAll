package JavaQuiz1;

public class Task6 {
    public static void main(String[] args) {
        int array_variable[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int sum = 0;

        for (int i = 0; i < 3; ++i) {

            for (int j = 0; j < 3; ++j) {

                sum = sum + array_variable[i][j];

            }

        }

        System.out.print(sum / 5);
    }

    public static class Task14 {
        public static void main(String[] args) {
            int x=1;

            do{

                x++;

                System.out.print(x);

            }while(x<5);

            System.out.println("--------");
            int z=2, sum=0;

            while(z<9) {

                z++;

                sum=sum+z;

            }

            System.out.print(sum);


            System.out.println("-------");
            int m=2, total=0;

            while(m<6) {

                total=total+m;

                m++;

            }

            System.out.print(total);
        }
    }
}
