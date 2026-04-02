package csd214.bookstore.pojos;

import java.util.Scanner;

public class Guitar extends MusicalInstrument {
    private String brand;
    private int stringCount;
    private double price;

    public Guitar() {
        super();
    }

    public Guitar(String brand, int stringCount, double price) {
        this.brand = brand;
        this.stringCount = stringCount;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStringCount() {
        return stringCount;
    }

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void edit(Scanner input) {
        super.edit();
        System.out.println("Current Strings: " + stringCount + ". Enter new count:");
        this.stringCount = getInput(stringCount);
    }

    @Override
    public void initialize(Scanner input) {
        this.initialize();
    }

    @Override
    public void initialize() {
        super.initialize();
        System.out.println("Enter number of strings (<6>):");
        this.stringCount = getInput(6);
    }

    @Override
    public void sellItem() {
        System.out.println("Selling a " + stringCount + "-stringed Guitar for $" + getPrice());
    }

    @Override
    public String toString() {
        return String.format("Guitar [ID: %s, Brand: %s, Strings: %d, Price: $%.2f]",
                getProductId(),
                brand,
                stringCount,
                price) + " " + super.toString();
    }
}