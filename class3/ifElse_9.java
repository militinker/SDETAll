package class3;

public class ifElse_9 {
    public static void main(String[] args) {
        char c='M';

        if(c=='M')
        {
            System.out.println("male");
        }


        String name="nat";
        //with non primitive data types as string we cant use == symbol
        if(name.equals("Sam")){
            System.out.println("Amazing Student");
        }
        if(!name.equals("Sam")){
            System.out.println("Super Amazing Student");
        }


        boolean hungry=true;
        System.out.println(hungry);
        System.out.println(!hungry);
        if(!hungry){
            System.out.println("Lets eat");
        }

    }
}
