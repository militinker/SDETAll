package JavaQuiz1;

public class Task8 {
    public static void main(String[] args) {
        int[] zip = new int[5];

        zip[0] = 7;
        zip[1] = 3;
        zip[2] = 4;
        zip[3] = 1;
        zip[4] = 9;

        System.out.println( zip[ 2 + 1 ] );

        System.out.println("------");

        for(int i=1; i<15; i=i+3) {

            System.out.print(i);}

        System.out.println("-------");

        int x=1;

        while(x<5) {

            x++;

            System.out.print(x);

        }

    }
}
