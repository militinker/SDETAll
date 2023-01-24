package project1;

public class Task10 {
    public static void main(String[] args) {
       //10)Write a java program to find the second largest number in the array?

        int []arr={4,44,66,78,19};
        int largest=arr[0];
        int secondLargest=arr[0];


        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];

            }else if(arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }

        System.out.println("Second largest number is "+secondLargest);
    }
}
