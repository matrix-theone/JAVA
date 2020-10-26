package BestAlbums;

public class Laptop { // parameterization of  constructor
    int yearFromClass;// goal : set these data using the constructor
    String modelFromClass;
    String makeFromClass;
    String keysFromClass;


    // default constructor
    public Laptop() {

    }

    public Laptop(int yearFromConstructor, String modelFromConstructor) {
        yearFromClass = yearFromConstructor;
        modelFromClass = modelFromConstructor;
    }

    public Laptop(int yearFromConstructor, String modelFromConstructor, String keysFromConstructor) {
        yearFromClass = yearFromConstructor;
        modelFromClass = modelFromConstructor;
        keysFromClass = keysFromConstructor;
    }

    public Laptop(int yearFromConstructor) {
        yearFromClass = yearFromConstructor;
    }

    public static void main(String[] args) {//psvm
        Laptop laptop = new Laptop();
        laptop.printDetailsOfLaptop();

        Laptop laptop3 = new Laptop(2019);
        laptop3.printDetailsOfLaptop();

        Laptop laptop4 = new Laptop(2020, "Texas", "Awesome");
        laptop4.printDetailsOfLaptop();
    }

    public void printDetailsOfLaptop() {
        System.out.println(yearFromClass);
        System.out.println(modelFromClass);
        System.out.println(keysFromClass);//sout

    }

}