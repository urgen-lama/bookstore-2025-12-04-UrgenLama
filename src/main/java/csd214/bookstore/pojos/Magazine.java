package csd214.bookstore.pojos;

import java.util.Date;

public class Magazine extends Publication {
    private int orderQty;
    private Date currentIssue;

    public Magazine() {
        super();
    }


    public Magazine(int orderQty, Date currentIssue, String title, double price, int copies) {
        super(title, price, copies);
        this.orderQty = orderQty;
        this.currentIssue = currentIssue;
    }

    @Override
    public void initialize() {
        super.initialize();
        System.out.println("Enter Order Quantity:");
        this.orderQty = getInput(0);
        System.out.println("Enter Date (dd-MMM-yyyy):");
        this.currentIssue = getInput(new Date());
    }

    @Override
    public void edit() {
        super.edit();
        System.out.println("Current Order Qty: " + orderQty + ". New Qty:");
        this.orderQty = getInput(orderQty);
        System.out.println("Current Date: " + currentIssue + ". New Date:");
        this.currentIssue = getInput(currentIssue);
    }

    @Override
    public void sellItem() {
        if (getCopies() > 0) {
            setCopies(getCopies() - 1);
            System.out.println("Sold Magazine: " + getTitle());
        }
    }


    public int getOrderQty() { return orderQty; }
    public void setOrderQty(int o) { this.orderQty = o; }
    public Date getCurrentIssue() { return currentIssue; }
    public void setCurrentIssue(Date d) { this.currentIssue = d; }
}