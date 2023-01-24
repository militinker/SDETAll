package class10;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int [] numbers={1,2,3,4,5};

        System.out.println(numbers[4]);

        // to print all the elements of array

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("------");
        //// enhanced/foreach for loop
        // when ever possible use below loop

        for( int num:numbers){
            System.out.println(num);
        }
    }
}
