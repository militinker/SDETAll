package class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number=125;
        byte shorterNumber=(byte) number;

        float f=10.5f;
        int num= (int)f;
        System.out.println(shorterNumber);
        System.out.println(num);

        byte b=10;
        int number2=b;
        short c=(short)number2;
        /*
        if we try to store content from smaller box to a bigger its fine
         but if we try from bigger into smaller java will show error
         thats why we have to put in brackets name of new box
         */

        float eggs=12.5f;
        int wholePart=(int)eggs;
        System.out.println(wholePart);


    }
}
