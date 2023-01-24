package class9;

public class ArraysDemo1 {
    public static void main(String[] args) {

        String name="slava";
        String name2="Safi";
        String name3="Jeff";
        String name4="Anees";
        String name5="Jason";
        System.out.println(name2);

        //                0        1     2       3       4
        String [] names={"Slava","Safi","Jeff","Anees","jason"};
        System.out.println(names[1]);
        System.out.println(names[4]);

        for (int i = 0; i <= names.length; i++) { // to not calculate how many elements inside array do sout(names.length) and it will print the number of elements
            System.out.println(names[i]);

        }







    }
}
