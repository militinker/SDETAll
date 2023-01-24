package JavaQuiz1;

public class Task5 {
    public static void main(String[] args) {



        char array_variable [] = new char[10];
        for (int i = 0; i < 10; ++i) {
            array_variable[i] = 'i';
            System.out.print(array_variable[i] + " ");
        }


    }

    public static class Task13 {
        public static void main(String[] args) {
            int k=3, tot=0;

            do{

                tot=tot+k;

                k++;

            } while(k<11);

            System.out.print(tot);
        }
    }
}
