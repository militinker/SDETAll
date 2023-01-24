package class6;

public class WhileLoop8 {

    public static void main(String[] args) {

        // 1 2 3 4 6 7 8 9 11 12 13 14 16
        //print below sequance with the help of loop

        int num=1;
        while(num<17){

            if (num%5!=0){
                System.out.println("even "+num);
            }
            num++;
        }


    }
}
