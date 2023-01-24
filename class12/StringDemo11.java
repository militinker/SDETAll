package class12;

public class StringDemo11 {
    public static void main(String[] args) {
        // count how many letters are in the string

        String str="jfdhbd ke54564 <>.*";

        int counter=0;
        for (int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i))){
                counter++;
        }

        }
        System.out.println("Total isAplthabetic in Str "+counter);





    }
}
