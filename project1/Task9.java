package project1;

public class Task9 {
    public static void main(String[] args) {
       //9)Maximum and minimum number in the array?

        int []arr={6,2,35,74,13};
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i <arr.length; i++) {

            if(arr[i]>max){
                max = arr[i];

            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.print("The maximum number is:" + max);
        System.out.println();
        System.out.print("The minimum number is: " + min);



    }
}
