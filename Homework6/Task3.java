package Homework6;

public class Task3 {
    public static void main(String[] args) {
        /*
        3) Using 2D array create a grocery list.
        Inside you should have an array of veggies, fruits, dairy and sweets.
        Retrieve all values from that array using 2 different loops
         */

        String[][] list={{"Carrots","Mushrooms","Onions"},
                {"Oranges","Bananas","Limes"},
                {"Milk","Cream","Cheese",},
                {"IceCream","Snickers","M&M",}
        };

        for (int i = 0; i <list.length ; i++)
            for (int j = 0; j <list[i].length ; j++) {
                System.out.println(list[i][j]+" ");
            }

        }


    }


