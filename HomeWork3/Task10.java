package HomeWork3;

public class Task10 {
    public static void main(String[] args) {
        boolean workDay = true;
        int day = 1;

        while (workDay) {
                System.out.println("I need a day off");
            if (day>=5){workDay=false;}

            day++;
        }
        System.out.println("i dont need day off anymore");
    }

    }
