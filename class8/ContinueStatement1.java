package class8;

public class ContinueStatement1 {
    public static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {

            if(i%3==0){ //if(i==3 || i==6 || i=9)
                continue; // skipp
            }else{
                System.out.println(i);

            }
            System.out.println("Hello Java");
        }






    }
}
