package BestAlbums;

public class Phone {

    String model;
    String price;

    //1
    public Phone() {

    }

    //2
    public Phone(String priceFromConstructor) {
        this.model = priceFromConstructor;
    }

    //3
    public Phone(String nameOfTheModelFromConstructor, String priceFromConstructor) {
        this.model = nameOfTheModelFromConstructor;
        this.price = priceFromConstructor;
    }

    public static void main(String[] args) {

        Phone phone3 = new Phone("galaxy note 20 ultra", "1299 USD");
        phone3.printPhone();

        Phone phone1 = new Phone();
        phone1.printPhone();

        Phone phone2 = new Phone("Apple Iphone 12");
        phone2.printPhone();
    }

    public void printPhone() {
        System.out.println(model);
        System.out.println(price);
    }
}
