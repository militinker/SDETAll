package class12;

import java.util.Locale;

public class StringDemo2 {
    public static void main(String[] args) {

        String str="JAVA is FUN";
        String newStr= str.toLowerCase(); //it is a method that we are calling on str
        System.out.println(newStr);


        String str2="i love java";
        String upperCaseLetter=str2.toUpperCase();
        System.out.println(upperCaseLetter);


    }
}
