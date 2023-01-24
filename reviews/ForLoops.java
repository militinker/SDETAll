package reviews;

public class ForLoops {
    public static void main(String[] args) {
        for (int i = 2; i <=20 ; i+=5) {
            System.out.println(i);
        }
        System.out.println("------");
        // break and continue
        for (int i = 2; i <=20 ; i+=5) {
            System.out.println(i);
            if (i==12){
                System.out.println("im breaking my loop");
            }
            break; //stops/breaks the loop
        }
        System.out.println("---------");
        //continue

        for (int i = 1; i <=10; i++) {
            if(i%3==0){
            System.out.println(i);
            continue;
        }
            System.out.println("hello");
        }




    }
}
