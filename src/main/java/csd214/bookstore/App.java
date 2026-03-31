package csd214.bookstore;

import csd214.bookstore.pojos.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private List<SaleableItem> items = new ArrayList<>();
    private Scanner input;

    public App() { this.input = new Scanner(System.in); }
    public App(Scanner input) { this.input = input; }

    public void run() {
        populate();
        int choice = 0;
        while (choice != 99) {
            System.out.println("\n1. Add Items\n5. List\n99. Quit");
            try {
                choice = Integer.parseInt(input.nextLine().trim());
            } catch (Exception e) { choice = 0; }

            if (choice == 1) addItem();
            else if (choice == 5) listAny();
            else if (choice == 99) break;
        }
    }

    public void addItem() {
        int choice = 0;
        while (choice != 99) {
            System.out.println("1. Book\n5. Pen\n99. Exit");
            try {
                choice = Integer.parseInt(input.nextLine().trim());
            } catch (Exception e) { choice = 0; }

            if (choice == 99) return;

            SaleableItem item = switch (choice) {
                case 1 -> new Book();
                case 5 -> new Pen();
                case 6 -> new Notebook();
                case 7 -> new Guitar();
                case 8 -> new Piano();
                default -> null;
            };

            if (item instanceof Editable e) {
                e.setScanner(this.input);
                e.initialize();
            }
            if (item != null) items.add(item);
        }
    }

    public SaleableItem findItem(SaleableItem item) {
        for (SaleableItem i : items) {
            if (i.equals(item)) return i;
        }
        return null;
    }

    public void populate() { /* Optional Faker data */ }
    public void listAny() { /* List logic */ }
}