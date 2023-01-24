package class8;

public class BreakKeyword1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if(i==3){
                break;
            }
            System.out.println(i);
        }

        System.out.println("Last line in our code");

        System.out.println("***********");
//        boolean summer=true;
//        int temp=75;
//
//        while(summer){
//
//            if(temp<=100){
//                System.out.println("I love Summer");
//            }else{
//                System.out.println("Its very hot");
//                break;
//            }
//            temp+=5;
//        }

        System.out.println("----------");

        boolean summer=true;
        int temp=75;

        while(summer){

            if(temp<=100){
                System.out.println("I love Summer"+temp);
                temp+=5;
            }

            else if (temp==100){
                System.out.println("Its Very hot"+temp);
            }

        }






    }
}
