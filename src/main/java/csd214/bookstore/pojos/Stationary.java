package csd214.bookstore.pojos;

import java.util.Objects;

public abstract class Stationary extends Product {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Stationary() {
    }

    @Override
    public String toString() {
        return "Stationary{" +
                "brand='" + brand + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Stationary that)) return false;
        return Objects.equals(getBrand(), that.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getBrand());
    }

    @Override
    public void initialize() {
        System.out.println("Enter Brand:");
        setBrand(getInput("Generic"));
    }
    @Override
    public void edit() {

        System.out.println("Edit Author [" + this.brand + "]:");
        this.brand = getInput(this.brand);
    }

}
