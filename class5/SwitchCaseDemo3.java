package class5;

public class SwitchCaseDemo3 {
    public static void main(String[] args) {

        String day="friday";
        switch (day){
            case "Monday":
                System.out.println("1");
                break;
            case "tuesday":
                System.out.println("2");
                break;
            case "wednesday":
                System.out.println("3");
                break;
            case "Friday":
                System.out.println("5");
                break;
            default:
                System.out.println("wrong day");
        }
    }
}
