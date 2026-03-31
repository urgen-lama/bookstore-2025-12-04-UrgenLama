package csd214.bookstore.pojos;

public class Book extends Publication {
    private String author;

    public Book() {
        super();
    }

    @Override
    public void initialize() {
        super.initialize();
        System.out.println("Enter Author:");
        this.author = getInput("Unknown");
    }

    @Override
    public void sellItem() {
        if (getCopies() > 0) {
            setCopies(getCopies() - 1);
            System.out.println("Sold 1 copy of " + getTitle() + " by " + author);
        } else {
            System.out.println("Book out of stock!");
        }
    }


    public String getAuthor() { return author; }
    public void setAuthor(String a) { this.author = a; }
}