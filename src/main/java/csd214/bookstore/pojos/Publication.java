package csd214.bookstore.pojos;

import java.util.Scanner;

public abstract class Publication extends Product {
    private String title;
    private int copies;

    public Publication() {
        super();
    }

    public Publication(String title, double price, int copies) {
        setProductId(java.util.UUID.randomUUID().toString());
        this.title = title;
        this.setPrice(price);
        this.copies = copies;
    }

    public void initPriceCopies() {
        System.out.println("Enter Copies:");
        this.copies = getInput(0);
        System.out.println("Enter Price:");
        this.setPrice(getInput(0.0));
    }

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
        System.out.println("Enter Title:");
        this.title = getInput("Untitled");
        initPriceCopies();
    }

    @Override
    public void edit() {
        super.edit();
        System.out.println("Current Title: " + title + ". New Title:");
        this.title = getInput(title);
        System.out.println("Current Copies: " + copies + ". New Copies:");
        this.copies = getInput(copies);
        System.out.println("Current Price: " + getPrice() + ". New Price:");
        this.setPrice(getInput(getPrice()));
    }

    public String getTitle() { return title; }
    public void setTitle(String t) { this.title = t; }
    public int getCopies() { return copies; }
    public void setCopies(int c) { this.copies = c; }
}