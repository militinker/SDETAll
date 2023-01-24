package class6;

public class WhileLoops6 {
    public static void main(String[] args) {


        boolean flag = true;
        int number = 0;

        while (flag) {
            System.out.println("hello world");
            if (number > 3) {
                flag = false;
            }
            number++;
        }
    }
}