package class8;

public class RecapDemo1 {
    public static void main(String[] args) {

        //print number 10 8 6 4 2

        for (int i = 10; i >= 2; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


        int a = 10;
        do {
            System.out.println(a);
            a = a - 2;
            //diferent way to decreas num by 2
        } while (a >= 2);
    }
}


