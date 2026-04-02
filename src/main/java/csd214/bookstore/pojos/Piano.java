package csd214.bookstore.pojos;

import java.util.Scanner;

public class Piano extends MusicalInstrument {
    private String pianoType;

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
        System.out.println("Enter Piano Type (e.g., Grand, Upright, Digital) (<Grand>):");
        this.pianoType = getInput("Grand");
    }

    @Override
    public void edit() {
        super.edit();
        System.out.println("Current Piano Type: " + pianoType + ". Enter new Type:");
        this.pianoType = getInput(pianoType);
    }

    @Override
    public void sellItem() {
        System.out.println("Selling a beautiful " + pianoType + " Piano for $" + getPrice());
    }

    @Override
    public String toString() {
        return String.format("Piano [ID: %s, Material: %s, Type: %s, Price: $%.2f]",
                getProductId(),
                material,
                pianoType,
                getPrice()) + " " + super.toString();
    }
}