package class8;

public class NestedLoops2 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) { // outer for loop

            for (int j = 0; j <5 ; j++) { // inner for loop
                System.out.print("* ");
            }

            System.out.println("*******");

        }

        for (int b = 0; b < 5 ; b++) {
            if(b==1 || b==2){
                continue;
            }
            System.out.print("- ");

        }
        System.out.println("------");




    }
}
