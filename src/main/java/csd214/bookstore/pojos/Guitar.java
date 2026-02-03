package csd214.bookstore.pojos;

public class Guitar extends MusicalInstrument{
    private int stringCount;

    @Override
    public void initialize() {
        super.initialize();
        System.out.println("Enter number of strings:");
        try {
            this.stringCount = Integer.parseInt(getInput("6"));
        } catch (NumberFormatException e) { this.stringCount = 6; }
    }

    @Override
    public void sellItem() {
        System.out.println("Selling a " + stringCount + "-stringed Guitar for $" + getPrice());
    }

    @Override
    public String toString() {
        return String.format("Guitar [Brand: %s, Strings: %d, Price: $%.2f]",
                getProductId(),
                stringCount,
                getPrice());
    }
}

