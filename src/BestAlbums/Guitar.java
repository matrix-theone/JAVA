package BestAlbums;

import java.util.Scanner;

public class Guitar {

    public static void main(String[] args) {
        printNumberOfStrings();
        printGuitarDetails("Jackson");
        printGuitarDetails("Ibanez", "2020");
        printNumberOfStrings(4, 3);
    }

    public static void printNumberOfStrings() {
        System.out.println(12);
    }

    public static void printGuitarDetails(String nameOfBrand) {
        System.out.println(nameOfBrand);
    }

    public static void printGuitarDetails(String nameOfBrand, String year) {
        System.out.println(nameOfBrand + " " + year);
    }

    public static void printNumberOfStrings(int extraString, int extraExtraString) {
        int numberOfStrings = 4;
        int totalString = numberOfStrings + extraString + extraExtraString;
        System.out.println(totalString);
    }

    public static void nameScanner() {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
    }


}
