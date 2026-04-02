package csd214.bookstore.pojos;

import java.util.Scanner;

public class Pen extends Stationery {
    private String color;

    @Override
    public void initialize(Scanner input) {
        this.initialize();
    }

    @Override
    public void edit(Scanner input) {
        this.edit();
    }

    @Override
    public void initialize() {
        super.initialize();
        System.out.println("Enter Color (<Blue>):");
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
                getBrand(), color, getPrice()) + " " + super.toString();
    }
}