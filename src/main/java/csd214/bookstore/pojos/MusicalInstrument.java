package csd214.bookstore.pojos;

import java.util.Objects;

public abstract class MusicalInstrument extends Product {
    protected String material;
    private double price;

    @Override
    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    @Override
    public void initialize() {
        super.initialize();
        System.out.println("Enter Material (e.g., Wood, Brass):");
        this.material = getInput("Wood");
        System.out.println("Enter Price:");
        try {
            this.price = Double.parseDouble(getInput("0.0"));
        } catch (NumberFormatException e) { this.price = 0.0; }
    }

    @Override
    public void edit() {
        super.edit();
        System.out.println("Current Material: " + material + ". New Material:");
        this.material = getInput(material);
        System.out.println("Current Price: " + price + ". New Price:");
        try {
            this.price = Double.parseDouble(getInput(String.valueOf(price)));
        } catch (NumberFormatException e) { }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MusicalInstrument that)) return false;
        return Double.compare(that.price, price) == 0 && Objects.equals(getProductId(), that.getProductId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductId(), price);
    }
}