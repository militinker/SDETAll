package reviews;

public class NestedLoops {
    public static void main(String[] args) {
        //nested loop = loop inside another loop

        for (int i = 1; i <=3 ; i++) { // outer loop
            System.out.println(i);

            for (int j = 1; j <=4 ; j++) { // inner loop
                System.out.println(j);
            }
        }


        System.out.println("------");

        for (int a = 0; a <=9; a++) {
            for (int b = 0; b <=9 ; b++) {
                for (int c = 0; c <=9; c++) {
                    for (int d = 0; d <=9 ; d++) {

                        System.out.println(a+" "+b+" "+c+" "+c);
                    }
                }

            }

        }

        System.out.println("-------");

        for (int e = 0; e <24 ; e++) {
            for (int f = 0; f < 60; f++) {
                System.out.println(e+":"+f);
            }

        }





    }
}
