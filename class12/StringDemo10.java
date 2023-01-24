package class12;

public class StringDemo10 {
    public static void main(String[] args) {
        String str="Java is Love";
        char c=str.charAt(2); //this charAT works based on the index. attaches to the letter inside the string

        System.out.println(c);

        System.out.println(str);


        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i)); // how to print all the letters from the loop

        }
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i)=='a') {
            sum++; }

        }
        System.out.print(str.length()); // to count how many letters inside
    }
}
