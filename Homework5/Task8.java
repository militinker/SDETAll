package Homework5;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        /* 6) Create an array of countries. While retrieving all values from an array
        print capital for each country choose any five countries.
                */

        String [] countries={"USA","France","Germany","Mexico","Serbia"};
       String [] cities={"Washington", "Paris","Berlin","Mexico","Belgrade"};


        for (int i = 0; i < countries.length; i++) {
            System.out.println(cities[i] + " is the capital of "+ countries[i]);
        }

    }
}
