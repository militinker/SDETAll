package Homework6;

public class Task6 {
    public static void main(String[] args) {
        /*
        6) Create 2D array of countries: north america countries, south america countries,
        europe countries, asian countries, african countries.
        Then print all values from that array using 2 different loops and calculate
         how many total countries been stored
         */

        String[][] countries={{"USA","Canada"},
                              {"Argentina","Peru"},
                              {"Serbia","Spain"},
                              {"China","India"},
                            {"Mozambique","Egypt"}};
            int sum=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++)
                System.out.print(countries[i][j] + " ");
            sum++;
        }
        System.out.println();



        System.out.println("length of array:" + countries.length); //number of rows
        for(int i=0;i<countries.length;i++)       //length of each row
             sum=sum+countries[i].length;
              System.out.println(sum);









    }

}
