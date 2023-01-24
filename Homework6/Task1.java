package Homework6;

public class Task1 {
    public static void main(String[] args) {
        /*
        1) Create a 2D array(shorter way) in which first array will consist of 4 names
         and second array will contain grades.
         Then your program should print name of the students that has A and B grade
         */

        String[] students={"John","Sam","Joe","Nicky"};
        String[] grades={"A","B","C","D","F"};
        String[][] school=new String[2][];
        school[0]=students;
        school[1]=grades;

        System.out.println(school[0][1]);






    }

}
