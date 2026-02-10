package csd214.bookstore.pojos;

import java.util.Scanner;

public class Pen extends Stationery{
    private String color;

    @Override
    public void initialize(Scanner input) {
        super.initialize();
        System.out.println("Enter Color:");
        this.color = getInput("Blue");
    }

    @Override
    public void edit() {
        super.edit();

        System.out.println("Current Color: " + color + ". Enter new Color:");
        this.color = getInput(color);
    }

    @Override
    public void sellItem() {
        System.out.println("Selling " + color + " Pen");
    }

    @Override
    public String toString() {
        return String.format("Pen [Brand: %s, Color: %s, Price: $%.2f]",
                getBrand(), color, getPrice());
    }
}

