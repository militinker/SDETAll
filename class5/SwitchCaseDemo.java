package class5;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        int day=1;
        switch (day){

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong day");
        }




        int dayy = 7;
        if (dayy == 1) {
            System.out.println("Monday");
        } else if (dayy == 2) {
            System.out.println("Tuesday");
        } else if (dayy == 3) {
            System.out.println("Wednesday");
        } else if (dayy == 4) {
            System.out.println("Thursday");
        } else if (dayy == 5) {
            System.out.println("Friday");
        } else if (dayy == 6) {
            System.out.println("Saturday");
        } else if (dayy == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Wrong day");
        }

    }
}
