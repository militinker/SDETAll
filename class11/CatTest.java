package class11;

public class CatTest {
    public static void main(String[] args) {
        // creatin an object from the cat class
        Cat amber= new Cat();


        amber.name="Lena";
        amber.breed="Van Cat";
        amber.age=2;
        amber.color="pink";
        amber.attitude=false;

        amber.eat(); //to call the behavior

        Cat cat2=new Cat();
        cat2.name="Loki";
        cat2.breed="Domestic";
        cat2.color="white";
        cat2.age=3;
        cat2.attitude=true;

        cat2.speak();

    }
}
