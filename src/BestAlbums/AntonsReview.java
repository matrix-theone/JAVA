package BestAlbums;

public class AntonsReview {

    public static void main(String[] args) {

        RemysKitchen Restaurant = new RemysKitchen();

        System.out.println("Welcome to Remy's Kitchen");
        Employees.headChef();

        Restaurant.suChef();
        Restaurant.humanPuppet();
        Restaurant.waiters();
        Restaurant.tables();
        Restaurant.stove();
        Restaurant.plates();
        Restaurant.menu();

        System.out.println("We Hope You Enjoy Our Meal and Leave a Satisfactory Review");
        System.out.println("Thank You For Your Visit");
    }
}
