package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        Below line is reserving/creating box in the computer's memory.
        we are calling it box1 and if we need the information that we are storing inside this box
        we can simply say it to the computer give us the contents of box 1.
        int=> what type of data we want to store
        box1> is the name of the box
        = sign will take whatever we write after it and will store it inside the box 1
        10=> is what we are storing inside
         */
        int box1=10;
        System.out.println(box1); // bring the contents of box1 and print in the console
        /*
        to store whole numbers we have 4 different types of numbers 10 20 3000 1000
        1) byte -128 to 127  2) short  3) int 4) Long
         */
        byte box2=127;
        byte box3=-128;
        short box4=32767;
        short box5=3256;
        int biggerBox=123456484; //most common type of box
        long maxBox=1513135145648l;
        short myBox=1000;
        System.out.println(myBox);





    }
}
