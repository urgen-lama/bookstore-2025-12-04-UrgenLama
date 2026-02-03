package csd214.bookstore.pojos;

public abstract class MusicalInstrument extends Product {
    protected String material;
    private double price; // Managed here to satisfy SaleableItem

    @Override
    public double getPrice() { return price; }

    @Override
    public void initialize() {
        super.initialize(); // Calls Product's logic
        System.out.println("Enter Material (e.g., Wood, Brass):");
        this.material = getInput("Wood");
        System.out.println("Enter Price:");
        try {
            this.price = Double.parseDouble(getInput("0.0"));
        } catch (NumberFormatException e) { this.price = 0.0; }
    }

    @Override
    public void edit() {
        super.edit(); // Calls Product's logic
        System.out.println("Current Material: " + material + ". New Material:");
        this.material = getInput(material);
        System.out.println("Current Price: " + price + ". New Price:");
        try {
            this.price = Double.parseDouble(getInput(String.valueOf(price)));
        } catch (NumberFormatException e) { }
    }
}
