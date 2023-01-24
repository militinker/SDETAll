package class5;

public class LogicalOperators3 {
    public static void main(String[] args) {

        /*
        if the score in all the subjects are greater than 90 print brilliant student
        otherwise print you need to work hard
         */

        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&false);


        double mathScore=92.5;
        double historyScore=91.5;
        double scienceScore=93.5;

        if(mathScore>90&&historyScore>90&&scienceScore>90){
            System.out.println("Brilliant student");
        }else{
            System.out.println("you need to work hard");
        }





    }
}
