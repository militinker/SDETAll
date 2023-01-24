package class12;

public class StringDemo8 {
    public static void main(String[] args) {

        String str="I love Java";

        boolean startsWith=str.startsWith("I"); // it checks if input starts with whaterver we put in
        System.out.println(str.endsWith("Java"));

        //method chaining is when multiple mehtods are called on the same line
        // only those methods can be chained which returns a string
        System.out.println(str.toLowerCase().startsWith("i"));
    }
}
