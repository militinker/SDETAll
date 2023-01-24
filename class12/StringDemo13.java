package class12;

public class StringDemo13 {
    public static void main(String[] args) {
        // when you want part of sentance
        String str="Send it to support channel.More java";
        String newStr=str.substring(28);
        System.out.println(newStr);
        System.out.println(str.substring(0,26));// to specify the starting and ending point
    }
}
