package class12;

public class StringDemo {
    public static void main(String[] args) {
        // creating an object of the string class
        String strObj=new String("Java");
        String strObj2="Java"; // easier shorter way to create and object of string class
        System.out.println(strObj2.length());// .lenght calculate how many characters we have in string and gives out a nu// mber

        String str="Banana";
         int len=str.length(); // how to save it as int
        System.out.println(str.length()); // or sout(len)

        String name="rafik poya ";
        if(name.length()>10){
            System.out.println("Name cant be more than 10 letters");
        }


    }
}
