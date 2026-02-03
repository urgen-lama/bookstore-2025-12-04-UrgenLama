package csd214.bookstore.pojos;

public abstract class Stationery extends Product {
    private String brand;
    private double price;

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void initialize() {

        System.out.println("Enter Brand:");
        this.brand = getInput("Generic");

        System.out.println("Enter Price:");
        try {
            this.price = Double.parseDouble(getInput("0.0"));
        } catch (NumberFormatException e) {
            this.price = 0.0;
        }
    }

    @Override
    public void edit() {
        String currentBrand = (getBrand() == null) ? "Generic" : getBrand();
        System.out.println("Current Brand: " + currentBrand + ". Enter new Brand:");
        setBrand(getInput(currentBrand));

        System.out.println("Current Price: " + getPrice() + ". Enter new Price:");
        try {
            double newPrice = Double.parseDouble(getInput(String.valueOf(getPrice())));
            this.price = newPrice;
        } catch (NumberFormatException e) {
        }
    }
}
