package csd214.bookstore.pojos;

import java.util.Scanner;

public class Notebook extends Stationery {
    private int pageCount;

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
        System.out.println("Enter Page Count (<100>):");
        this.pageCount = getInput(100);
    }

    @Override
    public void edit() {
        super.edit();
        System.out.println("Current Page Count: " + pageCount + ". Enter new Page Count:");
        this.pageCount = getInput(pageCount);
    }

    @Override
    public void sellItem() {
        System.out.println("Selling " + getBrand() + " Notebook with " + pageCount + " pages.");
    }

    @Override
    public String toString() {
        return String.format("Notebook [Brand: %s, Pages: %d, Price: $%.2f]",
                getBrand(),
                pageCount,
                getPrice()
        ) + " " + super.toString();
    }
}