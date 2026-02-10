package csd214.bookstore.pojos;

import java.io.Serializable;

public abstract class Product extends Editable implements SaleableItem, Serializable {
    private String productId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void initialize() {
        System.out.println("Enter Brand");
        this.productId = getInput("Generic");
    }

    @Override
    public void edit() {
        System.out.println("Current Brand: " + this.productId);
        this.productId = getInput(this.productId);

    }
}