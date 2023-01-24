package project1;

public class Task11 {
    public static void main(String[] args) {
       //11)Write a program to print out duplicate elements from an Array of Strings?
        String[]arr1={"Mili","Selena","Mili","Selena","Savo","Maria"};

        for (int i = 0; i < arr1.length-1; i++) {

            for (int j = i+1; j < arr1.length; j++) {
                if(arr1[i].equalsIgnoreCase(arr1[j]) && i!=j){

                    System.out.println("Duplicate is "+arr1[j]);
                }
            }



        }


    }
}
