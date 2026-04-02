package csd214.bookstore.pojos;

import java.util.Scanner;

public class Ticket extends Product {
    public String description = "";
    public double price = 0.0;

    @Override
    public void initialize(Scanner input) {
        this.initialize();
    }

    @Override
    public void edit(Scanner input) {
        this.edit();
    }

    @Override
    public void sellItem() {
        System.out.println("Selling Ticket: " + description + " for " + price);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void initialize() {
        super.initialize();
        System.out.println("Enter Description:");
        this.description = getInput("Ticket");

        System.out.println("Enter Price:");
        this.price = getInput(0.0);
    }

    @Override
    public void edit() {
        super.edit();
        System.out.println("Edit Description [" + this.description + "]:");
        this.description = getInput(this.description);

        System.out.println("Edit Price [" + this.price + "]:");
        this.price = getInput(this.price);
    }

    @Override
    public String toString() {
        return "Ticket{desc='" + description + "', price=" + price + "} " + super.toString();
    }
}