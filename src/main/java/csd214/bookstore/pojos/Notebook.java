package csd214.bookstore.pojos;

public class Notebook extends Stationery {
    private int pageCount;

    @Override
    public void initialize() {
        super.initialize();
        System.out.println("Enter Page Count:");
        try {
            this.pageCount = Integer.parseInt(getInput("100"));
        } catch (NumberFormatException e) { this.pageCount = 100; }
    }

    @Override
    public void edit() {
        super.edit();

        System.out.println("Current Page Count: " + pageCount + ". Enter new Page Count:");
        try {
            this.pageCount = Integer.parseInt(getInput(String.valueOf(pageCount)));
        } catch (NumberFormatException e) {
        }
    }

    @Override
    public void sellItem() {
        System.out.println("Selling " + getBrand() + " Notebook with " + pageCount + " pagesno");
    }

    @Override
    public String toString() {
        return String.format("Notebook [Brand: %s, Pages: %d, Price: $%.2f]",
                getBrand(),
                pageCount,
                getPrice()
        );
    }
}