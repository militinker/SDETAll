package class4;

public class ifDemo_1 {
    public static void main(String[] args) {
        int money = 15000;

        if (money > 1000) {
            System.out.println("lets buy an Iphone");
        }

        if (money > 2000) {
            System.out.println("Lets also buy a macbook");


        }

        boolean mothersDay = true;
        if (mothersDay) {
            System.out.println("Happy Mothers Day");
        }

        String name = "Sardar";
        // this one wont print as letter is small and big, also for string we dont use ==
        if (name == "sardar") {
            System.out.println("I love Football");

        }
        if (name.equals("Sardar")) {
            System.out.println("I Love football");
        }
    }
}
