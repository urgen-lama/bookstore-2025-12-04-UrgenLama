package csd214.bookstore.pojos;

public abstract class Product extends Editable {
    private String productId;
    private double price;

    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }


    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public void initialize() {
        System.out.println("Enter Product ID:");
        this.productId = getInput("Unknown");
    }

    @Override
    public void edit() {
        System.out.println("Current ID: " + productId + ". New ID:");
        this.productId = getInput(productId);
    }
}