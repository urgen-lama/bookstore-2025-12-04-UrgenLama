package csd214.bookstore.pojos;

public class Piano extends MusicalInstrument{
    private String pianoType;

    @Override
    public void initialize() {
        super.initialize();
        System.out.println("Enter Piano Type (e.g., Grand, Upright, Digital):");
        this.pianoType = getInput("Grand");
    }

    @Override
    public void sellItem() {
        System.out.println("Selling a beautiful " + pianoType + " Piano for $" + getPrice());
    }

    @Override
    public String toString() {
        return String.format("Piano [Brand: %s, Material: %s, Type: %s, Price: $%.2f]",
                getProductId(),
                material,
                pianoType,
                getPrice());
    }
}
