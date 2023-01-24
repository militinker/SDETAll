package class3;

public class VariablesDemo_2 {
    public static void main(String[] args) {
        int number23=10; // to change name of variable right click,refactor,rename
        System.out.println(number23);
        int age=10;
        System.out.println(age);

        age=20;
        System.out.println(age);
        int number=10;
        age=number; // im telling java replace the value of age with value of number valuable
        System.out.println(age);
        age=number+10;
        System.out.println(age);
        age=age+20;
        System.out.println(age);
    }
}
