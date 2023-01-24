package class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {


        //limitations of Foreach Loop
         // write a loop to print only odd number
       int[] arr={10,30,20,25,45,50};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                // arr[i]=0; turned all odd numbers to 0
                System.out.println(arr[i]);

            }
        }
        // replace all the odd numbers in this array with the help of new loop
       // arr[1]=0; //to update te value of single element in array
        //below is 2nd way


        for (int i = 0; i < 6; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = 0;
                continue;
            }
        }



    }
}
