package csd214.bookstore.pojos;

import java.util.Scanner;

public abstract class Product extends Editable {
    private String productId;
    private double price;

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }

    public double getPrice() { return price; }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public abstract void initialize(Scanner input);
    public abstract void edit(Scanner input);
    public abstract void sellItem();

    @Override
    public void initialize() {
        this.productId = getInput("Unknown");
    }

    @Override
    public void edit() {
        this.productId = getInput(productId);
    }
}